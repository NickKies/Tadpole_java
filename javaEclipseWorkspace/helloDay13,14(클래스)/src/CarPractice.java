class Cars {
 
 static int wheel=4; // 클래스 변수 
 //static int speed;
 int speed;    // static이 안붙으면 인스턴스 변수
 
}
public class CarPractice {

	public static void main(String[] args) {
		System.out.println("바퀴:"+Cars.wheel);  // 클래스이름에 점을 붙이면 static이 붙은 클래스변수에 
		  // 접근할수 있다==> 내부적으로 클래스 변수는 처음 이 프로그램이 로드될때 클래스 영역에 유지된다.
		  // 클래스이름이로 인스턴스 변수에는 접근 불가 
		  //System.out.println(Cars.speed);
		  
		  Cars myCar1 = new Cars(); //클래스 Cars의 첫번째 인스턴스
		   //myCar1은 Cars 인스턴스의 참조변수
		  
		  System.out.println("클래스변수의 참조"+Cars.wheel);
		  System.out.println("인스턴스변수의 참조"+myCar1.speed);
		  
		  Cars myCar2 = new Cars();
		  
		  System.out.println("<변경 전>");
		  System.out.println("myCar1.speed:"+myCar1.speed);
		  System.out.println("myCar2.speed:"+myCar2.speed);
		  System.out.println("myCar1.wheel:"+myCar1.wheel);//!! 
		  System.out.println("myCar2.wheel:"+myCar2.wheel);//!!
		   // wheel은 클래스 변수이지만 인스턴스 객체에서 접근 가능
		  
		  myCar2.speed=100;
		  myCar2.wheel=5;
		  System.out.println("<변경 후>");
		  System.out.println("myCar1.speed:"+myCar1.speed); //0  인스턴스변수
		  System.out.println("myCar2.speed:"+myCar2.speed); //100 인스턴스변수
		  System.out.println("myCar1.wheel:"+myCar1.wheel); //5  클래스변수
		  System.out.println("myCar2.wheel:"+myCar2.wheel); //5  클래스변수

	}

}
