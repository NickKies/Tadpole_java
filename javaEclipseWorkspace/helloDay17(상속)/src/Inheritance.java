

	class Person{
		 void say() {
		  System.out.println("말합니다.");
		 }
		}

		class Student extends Person{  // 상속 ****깐츄롤 t ******
		  // 상속 : 기존의 클래스가 가진 멤버를 물려받기 때문에 
		  // 새롭게 작성해야할 코드의 양이 줄어드는 효과가 있음
		  // 이때, 멤버를 물려주는 클래스를 부모 클래스 또는 조상 클래스라 하고
		  // 상속 받는 클래스를 자식 클래스 또는 자손 클래스라 한다.
		  // 108p ==> 코드 재사용의 효과(중복 지양)
		  // ** 주의 : 생성자는 상속되지 않는다.(생성자도 일종의 멤버이지만)  
		 
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
public class Inheritance {
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
