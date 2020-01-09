import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

// 스레드를 상속받는 채팅서버스레드 클래스를 생성하고 닉네임, 소켓번호, PrintWriter를 담을 배열을 생성합니다.
public class ChatServerProcessThread extends Thread{
	private String nickname = null;
	private Socket socket = null;
	List<PrintWriter> listWriters = null;

	// 소켓, 배열리스트를 변수로 하는 메소드를 생성합니다. 대화명을 리스트에 저장합니다.
	public ChatServerProcessThread(Socket socket, List<PrintWriter> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}
	
	// 스레드를 작동시키는 run메소드를 오버라이드합니다.
	@Override
	public void run() {
		try {
			
			//클라이언트와 같은 방식으로 BufferedReader, PrintWriter를 통해 읽고 쓰면서 while문으로 데이터를 처리합니다. 
			BufferedReader buffereedReader = 
					new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			
			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
			
			while(true) {
				// 윈도우창에서 request로 받아진 데이터를 읽습니다. 
				String request = buffereedReader.readLine();
				
				// 윈도우에서 데이터를 보내지 않는다면 연결 끊김 메세지를 콘솔에 띄우고 printWriter를 종료하고 빠져나갑니다.
				if( request == null) {
					consoleLog("클라이언트로부터 연결 끊김");
					doQuit(printWriter);
					break;
				}
				
				// 참여할때, 메세지를 보낼때, 퇴장했을 때를 구분합니다.
				String[] tokens = request.split(":");
				if("join".equals(tokens[0])) {
					doJoin(tokens[1], printWriter);
				}
				else if("message".equals(tokens[0])) {
					doMessage(tokens[1]);
				}
				else if("quit".equals(tokens[0])) {
					doQuit(printWriter);
				}
			}
		}
		catch(IOException e) {
			consoleLog(this.nickname + "님이 채팅방을 나갔습니다.");
		}
	}
	
	// 나갔을경우 퇴장메세지를 띄웁니다. 
	private void doQuit(PrintWriter writer) {
		removeWriter(writer);
		
		String data = this.nickname + "님이 퇴장했습니다.";
		broadcast(data);
	}

	// 나간경우에 리스트에서 대화명을 지웁니다.
	private void removeWriter(PrintWriter writer) {
		synchronized (listWriters) {
			listWriters.remove(writer);
		}
	}

	// 참여자가 데이터를 보내는경우 대화명 : (데이터내용)을 보여줍니다.
	private void doMessage(String data) {
		broadcast(this.nickname + ":" + data);
	}

	// 입장했을 때 대화명을 닉네임에 저장하고, 대화명을 리스트배열에 저장합니다. 
	// 대화명 님이 입장하였습니다 메세지를 보여줍니다.
	private void doJoin(String nickname, PrintWriter writer) {
		this.nickname = nickname;
		
		String data = nickname + "님이 입장하였습니다.";
		broadcast(data);
		
		addWriter(writer);
	}

	// writer를 추가합니다.
	private void addWriter(PrintWriter writer) {
		synchronized (listWriters) {
			listWriters.add(writer);
		}
	}
	
	// 추가된 writer가 기존 writer와 동일한 메소드를 사용합니다.
	private void broadcast(String data) {
		synchronized (listWriters) {
			for(PrintWriter writer : listWriters) {
				writer.println(data);
				writer.flush();
			}
		}
	}
	// log를 실행합니다.
	private void consoleLog(String log) {
		System.out.println(log);
	}
}