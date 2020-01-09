package helloDay19_3;
class Animal{
	 void breath() {
	  System.out.println("숨쉬기");
	 }
	}

	class Lion extends Animal{
	 public String toString() {
	  return "사자";
	 }
	 public void notice() {
	  System.out.println("오늘은 먹이 없다.");
	 }
	}

	class Rabbit extends Animal{
	 public String toString() {
	  return"토끼";
	 }
	}

	class Monkey extends Animal{
	 public String toString() {
	  return "원숭이";
	 }
	}

	class ZooKeeper{
	 void feed(Animal animal) {
	  System.out.println(animal+"에게 먹이 주기");
	 }
	}
public class Polymorphism3 {

	public static void main(String[] args) {
		Animal lion1 = new Lion();
		  ZooKeeper james = new ZooKeeper();
		  james.feed(lion1);
		  //lion1.notice(); <== 안됨!!부모클래스의 참조변수로 자손 클래스의 인스턴스를 참조할 때 주의! 
		  Lion lion2 = new Lion();
		  lion2.notice();  // <== 요롷게 해야 가능
		  
		  Animal rabbit1 = new Rabbit();
		  james.feed(rabbit1);
		  Animal monkey1 = new Monkey();
		  james.feed(monkey1);

	}

}
