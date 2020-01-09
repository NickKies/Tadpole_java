package DataBase6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBase6 {
	
		public static void main(String[] args) {
			String url = "jdbc:mariadb://localhost:3306/javatest";
			String user = "root";
			String pw = "1234";
			String sql = "";
			PreparedStatement pstmt = null;
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Scanner sc = new Scanner(System.in);
				System.out.println("���̵� �Է��� �ּ���.");
				String user_id = sc.next();	// apple
				System.out.println("�н����带 �Է��� �ּ���.");
				String pass = sc.next();	// 1111
				Connection con = DriverManager.getConnection(url, user, pw);
				sql = "SELECT idx FROM member where user_id=? and pass=?";	
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,  user_id);
				pstmt.setString(2,  pass);
				ResultSet rs = pstmt.executeQuery();

				if(rs.next()) {
					System.out.println("�α��� �Ǿ����ϴ�.");
				}else {
					System.out.println("���̵� �Ǵ� �н����尡 �߸� �Ǿ����ϴ�.");
				}
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

