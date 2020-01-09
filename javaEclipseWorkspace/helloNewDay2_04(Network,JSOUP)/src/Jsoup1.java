
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Jsoup1 {

	public static void main(String[] args) {
		Document doc = null;
		try {
		String connUrl = "https://www.daum.net";
		doc = Jsoup.connect(connUrl).get();
		System.out.println(doc.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
