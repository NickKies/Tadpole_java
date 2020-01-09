
public class BaseExceptionTest {

	public static void main(String[] args) {
			  int a = 0;
			  int b = 2;
			  int d[] = {2,0}; // 정수형 배열의 생성과 초기화
			  try {
			   //int c = b/a;  // 예외처리 대상라인(주석처리)   
			   int e = b/d[2];  // 배열의 어떤 요소로 b를 나누어줌 : 예외처리 대상라인
			  /*}catch(ArithmeticException e) {
			   System.out.println("0으로 나눌 수 없습니다.");
			  }catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println("배열의 범위를 넘은 요소를 접근하였습니다.");*/
			  }catch(Exception e) { // 통체로 잡아내어 무슨 예외인지 확실히 알 수 없음 ==> 세분화시켜 줄 수 있음
			   System.out.println("예외가 발생하였음!");
			   //System.out.println(e.toString());
			   e.printStackTrace(); //<== 제일 많이씀
			   /*}finally {
			   System.out.println("예외처리가 보고됨");
			   System.out.println("DB 커넥션 종료");
			  */}
			  
			  System.out.println("예외처리를 공부하고 있음");  //try~catch문 바깥문장이니 언제나 실행

	}

}
