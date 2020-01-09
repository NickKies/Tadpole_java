
public class ExceptionTest {
	 public static void funA() throws Exception{
		  funB(); // 메소드 호출
		 }
		 
	 public static void funB() throws Exception{
		  Exception e = new Exception("고의적 예외"); // 예외객체 생성
		  throw e;  // ==>뜻: e라는 예외를 고의적으로 발생시킬 수 있다.
		 }

		 public static void main(String[] args) {
		  try {
		   funA();
		  }catch(Exception e) {
		   System.out.println("예외 발생");
		   //System.out.println(e.getMessage());
		   //System.out.println(e.toString());
		   e.printStackTrace();
		  }
	 }
}