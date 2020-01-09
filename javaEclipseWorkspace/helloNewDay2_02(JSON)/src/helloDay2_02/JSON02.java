package helloDay2_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON02 {

	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/javatest";
		  String user = "root";
		  String pw = "1234";
		  String sql = "";
		  PreparedStatement pstmt = null;
		  
		  JSONObject jsonObject = new JSONObject();   
		  JSONArray memberArray = new JSONArray();  
		  JSONObject personInfo = new JSONObject();
		  
		  try {
		   Class.forName("org.mariadb.jdbc.Driver");
		   Connection con = DriverManager.getConnection(url, user, pw);
		   StringBuilder sb = new StringBuilder();
		   sql = sb.append("SELECT user_id, name, gender, address1,"
		     + " address2, address3 from member").append(";").toString();
		   pstmt = con.prepareStatement(sql); 
		   ResultSet rs = pstmt.executeQuery();
		   
		   while(rs.next()) {
		    personInfo.put("idx",rs.getString("idx"));  
		    personInfo.put("user_id",rs.getString("user_id"));
		    personInfo.put("name",rs.getString("name"));
		    personInfo.put("pass",rs.getString("pass"));
		    personInfo.put("gender",rs.getString("gender"));
		    personInfo.put("email",rs.getString("email"));
		    personInfo.put("zipcode",rs.getString("zipcode"));
		    personInfo.put("address1",rs.getString("address1"));
		    personInfo.put("address2",rs.getString("address2"));
		    personInfo.put("address3",rs.getString("address3"));
		    memberArray.add(personInfo);
		    
		    jsonObject.put("member",memberArray);
		    
		    String jsonInfo = jsonObject.toJSONString();
		    System.out.println(jsonInfo);
		      }
		   
		  }catch(SQLException e) {
		   System.out.println("SQLException");
		  }catch(ClassNotFoundException e1) {
		   System.out.println("SQLException");
		  }

	}

}
