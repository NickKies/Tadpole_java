import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer {
	
	public static void main(String[] args) {
		
			// 1단계 : 서버소켓 생성후 client 대기중
			ServerSocket server;
			try {
				server = new ServerSocket(11111);
			
			System.out.println("서버소켓 생성됨. 대기모드 입니다.");
			
			// 2단계 : 일반소켓으로 서버소켓의 접속을 받음
			Socket socket = server.accept();
			System.out.println("Client 접속 허용");
			
			// 3단계 : 접속한 Client 주소 표시
			InetAddress add = socket.getInetAddress();
			System.out.println(add+"Client 접속함");
			
			// 4단계 : 소켓으로 접속한 stream 처리 -> Stream은 자바에서 기본적으로 byte로 처리
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 5단계 : while 문으로 소켓으로 연결된 데이터를 주고받기 -> byte단위를 쉽게 처리하도록
			// Reader/Writer로 변환
			InputStreamReader isr = new InputStreamReader(is);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
			// 6단계 : Stream Reader/Stream Writer 변환을 ButteredReader/BufferedWriter로 처리
			BufferedReader br = new BufferedReader(isr);
			PrintWriter pw = new PrintWriter(osw);
			
			while(true) {
				String data = br.readLine();
				if(data.equals("Q") || data.equals("q")) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println("Client에서 전달된 내용:" + data);
			}
			
			br.close();
			pw.close();
			socket.close();
			isr.close();
			osw.close();
			
			}catch (Exception e) {
				System.out.println("Network Exception");
			}
	}
}
