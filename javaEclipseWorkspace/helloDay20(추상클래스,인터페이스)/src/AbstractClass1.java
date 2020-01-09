

	abstract class Poketmon {

		 String name;
		 
		 abstract void attack();
		 abstract void sound();
		 
		 public String getName() {
		  return this.name;
		 } 
		}

		class Pikachu extends Poketmon {
		 Pikachu(){
		  this.name = "피카츄";
		 }
		 @Override
		 void attack() {
		  System.out.println("전기 공격");
		 }
		 @Override
		 void sound() {
		  System.out.println("피카 피카");  
		 }
		}

		class Squirtle extends Poketmon{
		 Squirtle() {
		  this.name = "꼬부기";
		 }
		 @Override
		 void attack() {
		  System.out.println("물 대포");
		 }
		 @Override
		 void sound() {
		  System.out.println("꼬북 꼬북");  
		 }
		}
public class AbstractClass1 {
	public static void main(String[] args) {
		 Pikachu pikachu1 = new Pikachu();
		  Squirtle squirtle1 = new Squirtle();
		  
		  System.out.println("이 포캣몬은: "+pikachu1.getName());
		  pikachu1.attack();
		  pikachu1.sound();
		  
		  System.out.println("이 포캣몬은: "+squirtle1.getName());
		  squirtle1.attack();
		  squirtle1.sound();

	}

}
