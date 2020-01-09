import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase5 {
	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/javatest";
		String user = "root";
		String pw = "1234";
		String sql = "";
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("����̹� �ε� �Ϸ�!");
			Connection con = DriverManager.getConnection(url, user, pw);
			StringBuilder sb = new StringBuilder();
			sql = sb.append(
					"SELECT user_id, NAME, gender, address1, address2,address3 FROM member")
					.append(";").toString();
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			// pstmt.executeUpdate() : insert, update, delete
			// pstmt.executeQuery() : select
			System.out.print("userid");
			System.out.print("\t");
			System.out.print("name");
			System.out.print("\t");
			System.out.print("gender");
			System.out.print("\t");
			System.out.print("address1");
			System.out.print("\t");
			System.out.print("address2");
			System.out.print("\t");
			System.out.print("address3");
			System.out.print("\n");
			System.out.println("_______________________________________");
			while(rs.next()) {
				System.out.print(rs.getString("user_id"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.print(rs.getString("gender"));
				System.out.print("\t");
				System.out.print(rs.getString("address1"));
				System.out.print("\t");
				System.out.print(rs.getString("address2"));
				System.out.print("\t");
				System.out.print(rs.getString("address3"));
				System.out.print("\n");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}






