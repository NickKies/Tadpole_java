import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json04 {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonObject = (JSONObject)parser.parse(new FileReader("C:\\Users\\KYS\\Documents\\webProgramming\\javaEclipseWorkspace\\helloDay2_03(JSON)\\src\\test.json"));
			Map<String, Object> map = new HashMap<String, Object>();
			// hashmap key와 값으로 구성 key 는 중복x 값은 중복 가능
			// key는 String으로 저장, 값은 object로 저장
			JSONObject jsonObj = (JSONObject)jsonObject.get("properties");
			Iterator<String> keysItr = jsonObj.keySet().iterator();
			
			while(keysItr.hasNext()) {
				String key = keysItr.next();
				Object value = jsonObj.get(key);
				System.out.println(key+":"+value);
				
				if(value instanceof JSONArray) {
					System.out.println("json array");
				}else if(value instanceof JSONObject) {
					System.out.println("json object");
				}
				map.put(key, value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}

	}

}
