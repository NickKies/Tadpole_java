// 클래스 메서드의 접근
class CMethod{
 static void manual() {  //클래스 영역에 처음에 로드돼서 공유됨 ==> 클래스 메서드
  System.out.println("이것은 넓이를 구하는 프로그램!");
  System.out.println("1.삼각형의 넓이");
  System.out.println("2.사각형의 넓이");
 }
 
 double triangle(int a, int b) { //삼각형의 넓이 ==> 인스턴스 메서드
  return (double) a*b/2;  
 }
 
 int rectangle(int a, int b) { // 사각형의 넓이 ==> 인스턴스 메서드
  return a*b;
 }
}

public class ClassMathodTest {

	public static void main(String[] args) {
		System.out.println("<클래스 메소드의 메소드 접근>");
		  // Case1. class 이름으로 instance method 접근
		  CMethod.manual();  // 클래스 이름으로 접근하면 클래스 메소드를 찾을 수 있고 실행가능
		  // Case2. class이름으로 instance method 접근
		  // CMethod.triangle(12,4); // 안되는 이유 : 클래스 이름으로 인스턴스 메서드 접근 불가
		  //          메모리에 아직 생성이 안되어 있을 수 있기 때문에 호출할 수 없다.
		  // Cmethod.rectagle(5,5); // 객체가 있어야 메모리에 존재한다.
		  
		  System.out.println("<인스턴스 메소드의 메소드 접근>");
		  // Case3. instance 객체를 생성해서 class method에 접근 ==> 가능
		  // class method는 프로그램이 로드 될 때 이미 자리잡고 있기 때문에 instance 객체가 접근 가능한 것이다
		  // 그러나, 설계시 class method는 class 영역에 한 개가 형성되어 공유된다.  
		  CMethod c1 = new CMethod(); // new 연산자 + 생성자 <== 객체 생성
		  c1.manual();
		  // Case4. instance 객체를 생성해서 instance 객체에 접근한다. ==> 가능
		  System.out.println(c1.rectangle(12, 12));
		  System.out.println(c1.triangle(12, 3));
		  c1.manual();

	}

}
