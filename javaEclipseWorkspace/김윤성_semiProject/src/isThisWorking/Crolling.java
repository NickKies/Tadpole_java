package isThisWorking;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;





public class Crolling {
	
	private static Moviedata[] moviedataArray = new Moviedata[100];
	
	public static void main(String[] args) {		
		String url = "https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=20190909";
		Document doc = null;
		//JSONObject jsonObject = new JSONObject();   
		//JSONArray movieArray = new JSONArray();  
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements element = doc.select("tbody").select("tr");

		
		String ranking = null;
		String title = null;
		String point = null;
		
		for(Element el : element) {
			ranking = el.getElementsByTag("img").attr("alt");
			title = el.select(".title").text();
			point = el.select(".point").text();
			
			if(title.equals("")) {
				continue;
			}
			
			/*System.out.print(ranking+"위");
			System.out.print(", 제목 : "+ title);
			System.out.println(", 평점 : "+ point);*/
			
			
			/*JSONObject movieInfo = new JSONObject(); 
			movieInfo.put("ranking","ranking");
			movieInfo.put("title","title");
			movieInfo.put("point","point");
			movieArray.add(movieInfo);			
			jsonObject.put("movie",movieArray);			
			String jsonInfo = jsonObject.toJSONString();
			System.out.println(jsonInfo);*/			
			
			
			
			Moviedata moviedata = new Moviedata(ranking, title, point);
			for(int i=0; i<moviedataArray.length; i++) {
				if(moviedataArray[i] == null) {
					moviedataArray[i] = moviedata;
					break;
				}
			}
		}
		/*for(int i=0; i<moviedataArray.length; i++) {
			Moviedata moviedata = moviedataArray[i];
			if(moviedata != null) {
				System.out.print("순위 : ");
				System.out.print(moviedata.getRanking());
				System.out.print(", 제목 : ");
				System.out.print(moviedata.getTitle());
				System.out.print(", 평점 :");
				System.out.println(moviedata.getPoint());
			}
		}*/
		
		
		Moviedata result = findRanking(ranking);
		if(result == null) {
			System.out.println("차트 불러오기 실패!");
			return;
		}
		System.out.println("차트 불러오기 성공!");
	
	}
	private static Moviedata findRanking(String ranking) {
		Moviedata moviedata = null;
		for(int i=0; i<moviedataArray.length; i++) {
			if(moviedataArray[i] != null) {
				String result = moviedataArray[i].getRanking();
				if(result.equals("01")) {
					moviedata = moviedataArray[i];
					break;
				}
			}
		}
		return moviedata;
	}
}



