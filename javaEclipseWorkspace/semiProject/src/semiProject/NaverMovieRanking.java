package semiProject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovieRanking {
	private static Scanner scanner = new Scanner(System.in);
	static ArrayList<Moviedata> MD = new ArrayList<Moviedata>();

	public static void main(String[] args) {
		boolean run = true;	
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.날짜 선택 | 2.차트보기 | 3.검색 | 4.차트 삭제 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createChart();
			} else if(selectNo == 2) {
				list();
			} else if(selectNo == 3) {
				search();
			} else if(selectNo == 4) {
				search();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
//메인 메소드
	//날짜 선택 & DB업로드
	private static void createChart() {
		System.out.println("----------------------------------------");
		System.out.println("저장할 영화평점순위의 날짜를 입력하세요.");
		System.out.println("예시) 0909");
		System.out.println("하루 전 까지만 집계되어 있습니다.");
		System.out.println("----------------------------------------");
		System.out.print("선택> ");
		
		int date = scanner.nextInt();
		String url = "https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=2019"+date;
		Document doc = null;
		String dbRanking = null;
		String dbTitle = null;
		String dbPoint = null;
		Elements db;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements element = doc.select("tbody").select("tr");
			for(int i=0; i<50; i++) {
				db = ((Element) element).getElementsByTag("img");
				dbRanking = db.get(i).attr("alt");
				db = element.select(".title");
				dbTitle = db.get(i).text();
				db = element.select(".point");
				dbPoint = db.get(i).text();
				
				if(dbTitle.equals("")) {
					continue;
				}
				MD.add(new Moviedata(dbRanking, dbTitle, dbPoint));
			}		
		
		DataBase.Uploading(MD);
		System.out.println(date+"가 업로드 되었습니다.");
	}

	//DB에서 다운 및 차트 전체보기
	private static void list() {
		System.out.println("-----------------------------------------");
		System.out.println("차트 보기");
		System.out.println("-----------------------------------------");
	}
	//DB에서 다운 및 검색
	private static void search() {
		boolean go = true; 
		while(go) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.순위 |2.제목 | 3.평점 | 4.처음");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");			
			int selectNo = scanner.nextInt();			
			if(selectNo == 1) {
				System.out.println("----------------------------------------------------------");
				System.out.println("검색할 순위를 입력하세요.");
				System.out.println("10이하는 앞에 0을 붙여주세요");
				System.out.println("ex) 01");
				System.out.println("----------------------------------------------------------");
				System.out.print("선택> ");
			} else if(selectNo == 2) {
				System.out.println("----------------------------------------------------------");
				System.out.println("검색할 제목을 입력하세요");
				System.out.println("----------------------------------------------------------");
				System.out.print("선택> ");				
			} else if(selectNo == 3) {
				System.out.println("----------------------------------------------------------");
				System.out.println("검색할 평점을 입력하세요");
				System.out.println("----------------------------------------------------------");
				System.out.print("선택> ");				
			} else if(selectNo == 4) {
				go = false;
			}
		}
	}
	
}

class Moviedata {
	private String ranking;
	private String title;
	private String point;
	
	public Moviedata(String ranking, String title, String point) {
		this.ranking = ranking;
		this.title = title;
		this.point = point;
	}
	
	public String getRanking() { return ranking; }
	public void setRanking(String ranking) { this.ranking = ranking; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getPoint() { return point; }
	public void setPoint(String point) { this.point = point; }
}

class DataBase {
	static void Uploading(ArrayList<Moviedata> MD) {
		String url="jdbc:mariadb://127.0.0.1:3306/movie";
		String user ="root";
		String pw= "1234";
		Connection con;
		String sql;
		
		try {		
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(url, user ,pw);
			for(int i=0; i<MD.size(); i++) {			
				sql="insert into movie(ranking, title, point) values(?,?,?)";
				PreparedStatement pstmt =con.prepareStatement(sql);
				pstmt.setString(1, MD.get(i).getRanking());
				pstmt.setString(2, MD.get(i).getTitle());
				pstmt.setString(3, MD.get(i).getPoint());
				pstmt.executeUpdate();
			}			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void Downloading(ArrayList<Moviedata> MD) {
		String url="jdbc:mariadb://127.0.0.1:3306/movie";
		String user ="root";
		String pw= "1234";
		Connection con;
		String sql;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(url, user ,pw);
			sql="select * from movie";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				String ranking = rs.getString("ranking");
				String title = rs.getString("title");
				String point = rs.getString("point");
				MD.add(new Moviedata(ranking, title, point));
			}			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


