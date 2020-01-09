package helloDay19_2;
class Animal{
	 void breath() {
	  System.out.println("숨쉬기");
	 }
	}

	class Lion extends Animal{
	 public String toString() {
	  return "사자";
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
	 void feed(Lion lion) {
	  System.out.println(lion+"에게 먹이 주기");
	 }
	 void feed(Rabbit rabit) {
	  System.out.println(rabit+"에게 먹이 주기");
	  }
	 void feed(Monkey monkey) {
	  System.out.println(monkey+"에게 먹이 주기");
	 }
	}
public class Polymorphism2 {

	public static void main(String[] args) {
		 Lion lion1 = new Lion();
		  ZooKeeper james = new ZooKeeper();
		  james.feed(lion1);
		  
		  Rabbit rabbit1 = new Rabbit();
		  james.feed(rabbit1);
		  Monkey monkey1 = new Monkey();
		  james.feed(monkey1);

	}

}
