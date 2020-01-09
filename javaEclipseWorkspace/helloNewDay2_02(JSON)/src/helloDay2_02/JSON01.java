package helloDay2_02;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON01 {

	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();   // 최종 완성될 JSONObject 선언
	  JSONArray memberArray = new JSONArray();  // member의 JSON 정보를 담을 Array를 선언
	  JSONObject personInfo = new JSONObject();  // 한 명 정보가 들어갈 JSONObject 선언
	  
	  personInfo.put("user_id","apple");
	  personInfo.put("name","김사과");
	  personInfo.put("pass","1111");
	  personInfo.put("gender","여자");
	  
	  memberArray.add(personInfo);
	  
	  personInfo = new JSONObject();
	  
	  personInfo.put("user_id","banana");
	  personInfo.put("name","반하나");
	  personInfo.put("pass","2222");
	  personInfo.put("gender","남자");
	  memberArray.add(personInfo);
	  
	  jsonObject.put("member",memberArray);
	  
	  String jsonInfo = jsonObject.toJSONString();
	  System.out.println(jsonInfo);

	}

}

