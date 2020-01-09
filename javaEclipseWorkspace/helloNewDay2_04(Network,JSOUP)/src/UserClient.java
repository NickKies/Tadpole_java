import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UserClient {

	public static void main(String[] args) {
		
		try {
			// 1단계 : 서버접속을 위한 ip, port를 사용
			Socket socket = new Socket("192.168.8.33",11111);
			
			// 2단계 : 소켓으로 접속한 stream 처리
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 3단계: while문으로 소켓으로 연결된 데이터를 주고 받기
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
		 
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("메세지 입력:");
				String data = key.readLine();
				if(data.equals("Q") || data.equals("q")) {
					System.out.println("클라이언트 종료!!");
					break;
				}
				
				pw.println(data);	// printwriter를 통해 전달할 데이터를 씁니다.
				pw.flush();			// 버퍼에 남겨진 데이터를 네트워크를 통해 전달합니다.
			}
			br.close();
			pw.close();
			socket.close();
			key.close();			
	
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
