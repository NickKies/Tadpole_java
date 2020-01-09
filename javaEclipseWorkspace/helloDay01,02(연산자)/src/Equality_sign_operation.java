
public class Equality_sign_operation {

	public static void main(String[] args) {
		double a = 3.14;
		double b = 5.14;
		//등가 비교 연산자
		// ==같다,   !=다르다
		//같으면 t, 다르면 t 
		  
		  
		System.out.println(a==b);
		System.out.println(a!=b);
		  
		String c1 = "Hello java!" ;  //String은 참조형 ==> 문자열 저장
		  
		System.out.println(c1.equals("Hello java!"));
		// equals() 메소드 사용하여 비교 ==> 같다
		System.out.println(c1.equals("Hello JAVA!"));
		  
	
	}

}
