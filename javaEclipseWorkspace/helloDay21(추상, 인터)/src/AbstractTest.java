//142페이지 :추상메소드, 추상클래스
 abstract class Pokemon{
 private String name; //1.private제어자:필드나 메소드에 이 제어자 붙으면 본 클래스에서만 변경 가능
 
 abstract void attack();
 abstract void sound();
 
 public String getName() { //게터(이름을 알려줌)
  return this.name;
 }
 
 public void setName(String name) { //세터(이름을 지정해줌)
  this.name = name;    //2.세터 추가
 }
 
}

class Pikachu extends Pokemon{
 Pikachu(){
   this.setName("피카츄");//3.세터로 이름변경
 }

 @Override
 void attack() {  //상속받은 추상 메소드 구체적 구현
  System.out.println("전기 공격");
  
 }

 @Override
 void sound() {    //상속받은 추상 메소드 구체적 구현
  System.out.println("피카 피카!");
  
 }
 
}

class Squirtle extends Pokemon{
 Squirtle(){
  this.setName("꼬부기"); //4.세터로 이름 변경
 }
 
 @Override
 void attack() {
  System.out.println("물 공격");
  
 }

 @Override
 void sound() {
  System.out.println("꼬북 꼬북!");
  
 }
 
 
}

public class AbstractTest {

	public static void main(String[] args) {
		 Pikachu pikachu1 = new Pikachu();
		  System.out.println("이 포켓몬은:"+pikachu1.getName());
		  pikachu1.attack();
		  pikachu1.sound();
		  System.out.println();
		  Squirtle squirtle1 = new Squirtle();
		  System.out.println("이 포켓몬은:"+squirtle1.getName());
		  squirtle1.attack();
		  squirtle1.sound();

	}

}
