package moviePrac;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Practice {

	public static void main(String[] args) {
		String url = "https://movie.naver.com/movie/point/af/list.nhn?&page=1";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();// get, post 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements element = doc.select("tbody").select("tr");

		String point = null;
		String movie = null;
		String title = null;
		
		for(Element el : element) {
			point = el.select(".point").text();
			System.out.println("평점 : "+point);
			
			movie = el.select(".movie").text();
			System.out.println("영화제모 : "+ movie);
			
			title = el.select(".title").text();
			title = title.replace(movie, "");
			title = title.substring(0, title.length()-2);
			System.out.println("영화평 : "+ title);
		}
	}

}
