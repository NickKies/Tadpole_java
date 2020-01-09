package day1.no5;

class Cars {
	
	static int wheel=4;
	int speed;
	
}

public class Car_practice_3 {

	public static void main(String[] args) {
		System.out.println(Cars.wheel);
		//System.out.println(Cars.speed);
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);
		
		Cars myCar2 = new Cars();
		
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed:"+myCar1.speed);
		System.out.println("myCar2.speed:"+myCar2.speed);
		System.out.println("myCar1.wheel:"+myCar1.wheel);
		System.out.println("myCar2.wheel:"+myCar2.wheel);
		
		myCar2.speed=100;
		myCar2.wheel=5;
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed:"+myCar1.speed);
		System.out.println("myCar2.speed:"+myCar2.speed);
		System.out.println("myCar1.wheel:"+myCar1.wheel);
		System.out.println("myCar2.wheel:"+myCar2.wheel);
	}

}
