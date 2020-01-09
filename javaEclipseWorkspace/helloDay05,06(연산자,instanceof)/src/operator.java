class A{}
class B extends A{}   //부모 class => A

public class operator {

	public static void main(String[] args) {
		// instanceof 객체냐? 
		  
		  A a = new A();
		  B b = new B();
		  
		  System.out.println("a instanceof A:"+(a instanceof A));  //a가 A의 객체냐
		  System.out.println("b instanceof A:"+(b instanceof A));  //b는 B의 객체, B는 A의 자손 => b는 A의 객체 쓸수 있음
		  System.out.println("a instanceof B:"+(a instanceof B));  //a가 B의 객체냐? =>ㅇㅇㄴ
		  System.out.println("b instanceof B:"+(b instanceof B));  //b는 B의 객체
	}

}
