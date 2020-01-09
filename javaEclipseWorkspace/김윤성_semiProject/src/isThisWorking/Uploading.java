package isThisWorking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Uploading {

	private static Moviedata[] moviedataArray = new Moviedata[100];
	
	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/movie";
		String user = "root";
		String pw = "1234";
		String sql = "";
		
		String dbranking = null;
		String dbtitle = null;
		String dbpoint = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pw);	
				
			for(int i=0; i<moviedataArray.length; i++) {
				Moviedata moviedata = findMoviedata(dbranking, dbtitle, dbpoint);
				if(moviedata != null) {
					
					if(con != null) {		
						sql = "insert into movie(ranking, title, point) + values (?,?,?)";
						PreparedStatement pstmt = con.prepareStatement(sql);
						
						pstmt.setString(1, dbranking);
						pstmt.setString(2, dbtitle);
						pstmt.setString(3, dbpoint);
						
						int result = pstmt.executeUpdate();
						if(result == 1) {
							System.out.println("성공");
						}else {
							System.out.println("실패");
						}
						break;
					}
				}	
			}
			
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버가 존재하지 않습니다.");
		}catch(SQLException  e) {
            e.printStackTrace();
		}
	}
	private static Moviedata findMoviedata(String ranking, String title, String point) {
		Moviedata moviedata = null;
		for(int i=0; i<moviedataArray.length; i++) {
			if(moviedataArray[i] != null) {
				String dbranking = moviedataArray[i].getRanking();
				String dbtitle = moviedataArray[i].getTitle();
				String dbpoint = moviedataArray[i].getPoint();
			}
		}
		return moviedata;
	}

}
