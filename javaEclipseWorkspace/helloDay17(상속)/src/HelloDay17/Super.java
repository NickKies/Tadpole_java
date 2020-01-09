package HelloDay17;
class Person{
	 Person(){
	  // 기본 생성자
	  this("사람"); // 자신과 같은 생성자를 생성자가 호출할 때는
	     // this()라는 매소드를 사용한다.
	 }
	 
	 Person(String name){ //매개변수가 있는 생성자
	  System.out.println(name+"은");
	 }
	 void say() {
	  System.out.println("말합니다.");
	 }
	}

	class Student extends Person{
	 Student(){
	  super();  // 같은 생성자인데 부모의 생성자를 호출할 때
	 }
	 Student(String name){
	  super(name); // 같은 생성자인데 부모의 매개변수가 있는 
	      // 생성자를 호출할 때 super()라는 메소드를 사용한다.
	 }  
	 
	 @Override // annotation(주석) : 구조에 대한 정보를 준다.
	 void say() {
	  System.out.println("선생님 안녕하세요.");
	  // 오버라이딩 : 메소드드 재정의
	 }
	}

	class Teacher extends Person{

	 @Override  // source - overriding 
	 void say() {
	  // TODO Auto-generated method stub
	  // super.say();
	   // super : this.color <-> 부모클래스 
	   // 자신의 상위 클래스를 가리키는 super 
	  System.out.println("애두라 안녕?");
	 } 
	}
public class Super {

	public static void main(String[] args) {
		 Student s1 = new Student();
		  Teacher t1 = new Teacher();
		  if(s1 instanceof Person) {
		   System.out.println("학생은");
		   s1.say();
		  }
		  
		  if(t1 instanceof Person) {
		   System.out.println("선생님은");
		   t1.say();
		  }

	}

}
