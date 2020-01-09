package isThisWorking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBase2 {

	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/movie";
		String user = "root";
		String pw = "1234";
		String sql = "";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 완료!");
			Connection con = DriverManager.getConnection(url, user, pw);
			
			Scanner sc =new Scanner(System.in);
			System.out.println("랭킹을 입력해 주세요");
			String ranking = sc.nextLine();
			System.out.println("제목을 입력해주세요");
			String title = sc.nextLine();
			System.out.println("평점을 입력해주세요");
			String point = sc.nextLine();
			
						
			if(con != null) {
				System.out.println("mysql 접속 성공");
				sql = "insert into movie(ranking, title, point) "
						+ "values (?,?,?)";
				
				//System.out.println(sql);
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ranking);
				pstmt.setString(2, title);
				pstmt.setString(3, point);
				
				
				int result = pstmt.executeUpdate();
				if(result == 1) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
			}
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버가 존재하지 않습니다.");
		}catch(SQLException  e) {
            e.printStackTrace();
		}
	}

}

