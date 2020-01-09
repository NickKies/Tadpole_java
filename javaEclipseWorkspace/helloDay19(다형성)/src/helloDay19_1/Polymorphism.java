package helloDay19_1;

class Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal {
	public String toString() {
		return "사자";
	}
}

class ZooKeeper {
	void feed(Lion lion) {
		System.out.println(lion + "에게 고기 주기");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Lion lion1 = new Lion();
		ZooKeeper james = new ZooKeeper();
		james.feed(lion1);

	}

}
