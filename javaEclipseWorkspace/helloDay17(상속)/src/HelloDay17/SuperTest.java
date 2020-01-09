package HelloDay17;

import java.util.Scanner;

class Car2{
	 // 멤버 필드
	 int wheel;
	 int speed;
	 String color;
	 /*Car2(){
	// 방법1 : 기본생성자를 만들어 준다.
	 }*/
	 Car2(String color){ //매개변수가 있는 생성자
	  this.color = color; // this: 자신의 인스턴스에서 멤버필드 접근  
	 }
	}

	class SportsCar extends Car2{
	 // 멤버필드
	 int speedLimit;
	 //** Object 클래스에 있는 메소드 사용가능
	 // 예) toString():문자열로 형변환,  equals() : 객체비교
	 SportsCar(String color, int speedLimit) {
	  super(color);
	//방법 2 : 매개변수가 있는(현재 존재하는) 부모의 생성자를 호출 
	  //this.color = color;
	  this.speedLimit = speedLimit; 
	 }
	}
public class SuperTest {

	public static void main(String[] args) {
		SportsCar sc1= new SportsCar("빨강",1000);
		  Scanner sc = new Scanner(System.in);
		  sc1.speedLimit = sc.nextInt();
		  System.out.println(sc1.color);
		  System.out.println(sc1.speedLimit);

	}

}
