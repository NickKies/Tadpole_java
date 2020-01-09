
public class Overlide {
	/******************************
	  * method의 overloading 
	  *  같은 이름의 method를 여러개 정의하는 것
	  *  => 매개변수 개수와 타입으로 구분
	  * @param args
	  */
	 /*static int sum(int a, int b) {
	  System.out.println("int형 인자 2개일 경우 호출된 sum");
	  return a+b;
	 }*/
	 // overloading은 리턴값으로 구분할 수는 없다.
	 // 즉 이름이 같고 리턴값이 다른 , method는 인자의 상태가 같으면 사용할 수 없다.
	 static double sum(int a, int b) {
	  System.out.println("int형 인자 2개일 경우 호출된 sum");
	  return a+b;
	 }
	 
	 static int sum(int a, int b, int c) {
	  System.out.println("int형 인자 3개일 경우 호출된 sum");
	  return a+b+c;
	 }
	 
	 static double sum(double a, double b, double c) {
	  System.out.println("double형 인자 3개일 경우 호출된 sum");
	  return a+b+c;
	 }
	 
	 static double sum(int a, double b, double c) {
	  return a+b+c;
	 }
	 
	 static double sum(double a, double b, int c) {
	  System.out.println("순서가 달라도 overloading이 성립된다.");
	  return a+b+c;
	 }
	 
	 public static void main(String[] args) {
	  System.out.println(sum(3,2));
	  System.out.println(sum(2,3,4));
	  System.out.println(sum(2.5,3.4,4));
	}

}
