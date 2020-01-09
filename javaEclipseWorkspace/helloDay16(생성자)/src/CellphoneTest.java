class Cellphone{
 // 멤버 필드 : 클래스의 정적 상태를 나타내는 변수선언
 String model = "iphone X";
 String color = "black";
 int capacity;
 // 멤버 메소드 : 클래스의 동적 상태를 나타내는 일종의 함수
 Cellphone(){
  // 기본생성자 
 }
 Cellphone(String color, int capacity){
  // ?? ==> 매개변수가 2개 있는 생성자
  // 1. 보통 메소드는 소문자로 시작하는데, 대문자로 시작되고 클래스이름과 동일
  // 2. 리턴값이 없는 메소드
  this.color = color;
  this.capacity=capacity;
 } 
 Cellphone(String model, String color, int capacity){
  this.model = model;
  this.color = color;
  this.capacity = capacity;
 } 
}
public class CellphoneTest {
	 /*******************
	  *  생성자 연습 105p
	  * @param args
	  */
	 public static void main(String[] args) {
	  //생성자의 사용방법과 의미
	  Cellphone myphone = new Cellphone("Galaxy 18","pink",1028);
	  Cellphone myphone1 = new Cellphone("red",64);
	  Cellphone protoPhone = new Cellphone();
	   // myphone1 이라는 객체의 공간이 힙영역에 생기고
	   // 그주소가 스택영역에 쌓임.(저장됨)
	   // 참고로 스택은 LIFO(Last In First out) 구조로 되어있다.  
	   // 생성자는 new 연산자 다음에 나와 그 클래스의 인스턴스 객체의 공간을
	   // 메모리에 할당해 주는 역할을 한다.
	  System.out.println(myphone1.model);
	  System.out.println(myphone1.color);
	  System.out.println(myphone1.capacity+" G");
	  System.out.println(myphone.model);
	  System.out.println(myphone.color);
	  System.out.println(myphone.capacity+" G");
	  System.out.println(protoPhone.model);
	 }
}
