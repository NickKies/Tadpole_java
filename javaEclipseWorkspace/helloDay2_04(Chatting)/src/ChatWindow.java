import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatWindow {
	private String name;
	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;

	// 소켓을 생성합니다.
	private Socket socket;

	//  이름과 소켓을 포함하는 채팅윈도우메소드를 반들고기본적인 프레임과 버튼과 설정을 만듭니다.
	public ChatWindow(String name, Socket socket) {
		this.name = name;
		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);
		this.socket = socket;

		// 스레드와 소켓을 연결하고 윈도우를 실행합니다.
		new ChatClientReceiveThread(socket).start();
	}

	public void show() {
		
		// 데이터를 입력받고 보낼 센드버튼의 색상과 기능을 설정합니다. 
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed( ActionEvent actionEvent ) {
				sendMessage();
			}
		});
	
		textField.setColumns(80);
		textField.addKeyListener( new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		// 개체들의 속성을 설정합니다.
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		frame.addWindowListener(new WindowAdapter() {
			
			// 윈도우를 닫을때 Writer를 통해서 quit 데이터를 전송하고 닫습니다.
			public void windowClosing(WindowEvent e) {
				PrintWriter pw;
				try {
					pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
					String request = "quit\r\n";
					pw.println(request);
					System.exit(0);
				}
				catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		frame.setVisible(true);
		frame.pack();
	}
	
	// 데이터를 보내는 메소드를 생성합니다.
	private void sendMessage() {
		PrintWriter pw;
		try {
			// Writer를 통해서 message: 데이터를 전송합니다.
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
			String message = textField.getText();
			String request = "message:" + message + "\r\n";
			pw.println(request);

			textField.setText("");
			textField.requestFocus();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 스레드를 상속받는 내부 클래스를 만듭니다.
	private class ChatClientReceiveThread extends Thread{
		Socket socket = null;
		
		// 소켓에 연결합니다.
		ChatClientReceiveThread(Socket socket){
			this.socket = socket;
		}

		// Reader로  데이더를 받아와 while문속에서 보낼때 마다 읽어줍니다.
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
				while(true) {
					String msg = br.readLine();
					textArea.append(msg);
					textArea.append("\n");
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}