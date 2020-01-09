import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	// 포트번호를 생성합니다.
	public static final int PORT = 9999;
	
	public static void main(String[] args) {
		// 서버 소켓 생성 및 소켓 초기화
		ServerSocket serverSocket = null;
		
		// PrintWriter 배열리스트(통신할 데이터)인 listWriters객체 생성
		List<PrintWriter> listWriters = new ArrayList<PrintWriter>();
		
		// try catch문으로 예외처리합니다.
		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket();
			// hostAddress객체에 로컬호스트.호스트주소를 받습니다.
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			
			// 서버소켓에 주소를 받은 hostAddress와 포트를 연동시킵니다.
			// ==> 클라이언트 소켓과 연결될 서버소켓을 준비합니다.
			serverSocket.bind( new InetSocketAddress(hostAddress, PORT) );
			
			// 연결 기다림-, 서버의 호스트주소, 포트번호를 콘솔에 나타내줍니다.
			consoleLog("연결 기다림 - " + hostAddress + ":" + PORT);
			
			// while문을 이용해서 채팅서버스레드를 작동시킵니다.
			while(true) {
				Socket socket = serverSocket.accept();
				new ChatServerProcessThread(socket, listWriters).start();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		// 소켓이 비어있고 소켓이 닫혀있다면 서버를 닫습니다.
		finally {
			try {
				if( serverSocket != null && !serverSocket.isClosed() ) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// log를 실행합니다.
	private static void consoleLog(String log) {
		System.out.println("[server " + Thread.currentThread().getId() + "] " + log);
	}
}