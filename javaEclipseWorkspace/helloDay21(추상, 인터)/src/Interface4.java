interface Camera{
 void photo(); 
}

interface Call{
 void calling();
 
}

interface Memo{
 void write();
}

interface Clock{
 void clock();
}

class MyCellPhone implements Camera,Call,Memo,Clock{ // 구현 클래스
  
 @Override
 public void clock() {
 }

 @Override
 public void write() {
 }

 @Override
 public void calling() {
 }

 @Override
 public void photo() {
 }
}

class PhoneUser{     // 미들웨어 격의 클래스 
 void call(MyCellPhone c) {
  System.out.println("전화를 걸었습니다.");
 }
 
 void call(Call c) {
  System.out.println("전화를 걸었습니다.");
 }
 
 void call(Camera c) {
  System.out.println("전화를 걸었습니다.");
 }
 
 void call(Memo c) {
  System.out.println("전화를 걸었습니다.");
 }
 
 void call(Clock c) {
  System.out.println("전화를 걸었습니다.");
 }
 
}

public class Interface4 {

	public static void main(String[] args) {
		MyCellPhone phone = new MyCellPhone(); 
		  Camera camera = new MyCellPhone();  //구현 객체를 각각의 타임으로 대입
		  Call call = new MyCellPhone();   
		  Memo memo = new MyCellPhone();
		  Clock clock = new MyCellPhone();
		  
		  PhoneUser user1 = new PhoneUser();
		  user1.call(phone);
		  user1.call(camera);
		  user1.call(call);
		  user1.call(memo);
		  user1.call(clock);

	}

}
