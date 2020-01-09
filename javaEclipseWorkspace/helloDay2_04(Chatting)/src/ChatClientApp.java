import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatClientApp {
	// 연결할 ip주소와 소켓번호 입력합니다.
	private static final String SERVER_IP = "172.30.1.23";
	private static final int SERVER_PORT = 9999;

	public static void main(String[] args) {
		// 대화명과 스케너 객체 생성
		String name = null;
		Scanner scanner = new Scanner(System.in);

		// while문으로 스케너를 사용해 name에  대화명을 저장합니다.
		while( true ) {
			System.out.println("대화명을 입력하세요.");
			System.out.print(">>> ");
			name = scanner.nextLine();
			
			// if문으로 공백을 입력받는다면 break를 통해 while문으로 돌아가 다시 대화명을 입력받습니다.
			if (name.isEmpty() == false ) {
				break;
			}			
			System.out.println("\n");
		}
		// 스케너를 닫습니다.
		scanner.close();

		// 클라이언트에 사용될 소켓을 만듭니다.
		Socket socket = new Socket();
		try {
			// 호스트 이름과 포트 번호를 InetAddress로 확인하고 소켓과 연결합니다. 
			socket.connect( new InetSocketAddress(SERVER_IP, SERVER_PORT) );
			
			// 연결에 성공하면 ("꼺똿..땖") 을 콘솔에 띄워줍니다.
			consoleLog("梨꾪똿諛⑹뿉 �엯�옣�븯���뒿�땲�떎.");
			
			// 입력받은 대화명과 소켓으로 채팅프로그램을 실행시킵니다.
			new ChatWindow(name, socket).show();
			
			// 소켓으로 접속한 stream으로 처리합니다 
			// 연결된 데이터를 byte단위로 쉽게 처리하기 위해서 Writer로 변환시키고, BufferedWriter로 처리합니다. 이떄 UTF_8형식을 사용합니다.
			// 스레드 클래스에서 읽고 쓰기 때문에 클라이언트 클래스에서는 쓰기만 하면 됩니다.
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
			
			// Printwriter를 통해 join + 대화명을  씁니다. 
			String request = "join:" + name + "\r\n";
			pw.println(request);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// log를 실행합니다.
	private static void consoleLog(String log) {
		System.out.println(log);
	}
}