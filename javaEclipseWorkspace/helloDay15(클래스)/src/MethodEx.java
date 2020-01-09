/*********************
 *  생성자란 : 인스턴스를 생성할 때 호출되어 인스턴스 변수들을 초기화하는 
 *  일종의 메소드이다.
 *  특징1: 리턴값이 없다
 *  특징2: 클래스이름과 같고, 그러므로 첫글자가 대문자인 경우가 많다.
 *  
 *  사용예: new연산자와 같이 쓰고, 힙 영역에 객체를 위한 공간을 할당한다.
 *  Cellphone cp = new Cellphone();
 *  여기서 Cellphone()이 생성자이다.
 * @author Administrator
 *
 */
 class Method{
  int amount = 0;   //this로 멤버변수 조작가능
  String color="white";
  
  Method(){
   //기본 생성자
    }
  
  Method(String style){
   // 인자가 있는 생성자(매개변수가 있는 생성자)
   color = style;
  }
    Method(int amount, String style){
     // 인자가 있는 생성자(매개변수가 있는 생성자)
     this.amount = amount ;  // 바로 이 클래스에서!! 0 ==> 50
     color = style;
    }
    
     void method1(){
     System.out.println("메소드 입니다.");
    }
   }
 
public class MethodEx {
	public static void main(String[] args) {
		  Method m1 = new Method();   // 기본 생성자 사용
		  Method m2 = new Method("black"); // 인자가 하나인 생성자
		  Method m3 = new Method(50,"blue"); // 인자가 두개인 생성자
		  
		  System.out.println(m1.amount);
		  System.out.println(m1.color);
		  System.out.println(m2.amount);
		  System.out.println(m2.color);
		  System.out.println(m3.amount);
		  System.out.println(m3.color);
		 }
}
