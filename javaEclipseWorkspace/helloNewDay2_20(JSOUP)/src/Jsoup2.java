import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Jsoup2 {

	/*
	 * Document 클래스 : 연결해서 얻어온 HTML 전체 문서
	 * Element 클래스 : Document의 HTML 요소
	 * Elements 클래스 : elements가 모인 자료형
	 * 
	 * */
	
	public static void main(String[] args) {
		String url = "https://sports.news.naver.com/kbaseball/index.nhn";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();// get, post 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(doc.html()); // html() : html문서를 String으로 변환
		
		Elements element = doc.select("div.home_news");

		String title = element.select("h2").text().substring(0,4);
		//String title = element.select("h2").html();
		
		System.out.println("============================================");
		System.out.println(title);
		System.out.println("============================================");
		
		for(Element el : element.select("li")) {
			System.out.println(el.text());
		}
		System.out.println("============================================");
	}

}
