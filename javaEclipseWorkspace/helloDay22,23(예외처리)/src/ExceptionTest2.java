class AgeException extends Exception{
 public AgeException() {
  //기본 생성자
 }
 public AgeException(String message) {
  super(message); //예외클래스에서 문자열을 받는 생성자를 호출해줌
  }
} 
public class ExceptionTest2 {
	public static void funAge(int age) throws AgeException {
		  //예외를 던질것임
		  if(age<19) {
		   throw new AgeException("19살 미만은 상어영화를 볼 수 없습니다.");
		  }
		 }
		 
		 public static void main(String[] args) {
		  int age = 3;
		  
		   // 상어 영화를 볼 수 있는가?
		  try {
		   funAge(age);
		  } catch (AgeException e) {
		   
		   System.out.println("[CGV]"+e.getMessage());
		   //e.printStackTrace();
		   
		  }
		 }
}

