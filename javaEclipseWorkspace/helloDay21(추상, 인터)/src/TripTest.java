interface Providable{
 void leisureSports(); //레저 스포츠
 void sightseeing();  //관광
 void food();    //외식
 // 1.8 버전부터는 디폴트 메소드와 정적 메소드가 적용돼서 구체적으로 
 // 구현할 수 있다. default {}, static {}
}

class KoreaTour implements Providable{  //인터페이스의 구현클래스

 @Override
 public void leisureSports() {
  System.out.println("한강에서 수상스키 투어");
  //인터페이스의 추상메소드 레저스포츠 구현
 }

 @Override
 public void sightseeing() {
  System.out.println("경복궁 관람 투어");
  //인터페이스의 추상메소드 관광 구현
 }

 @Override
 public void food() {
  System.out.println("전주 비빔밥 투어");
  //인터페이스의 추상메소드 외식 구현
 }
 
}
class JapanTour implements Providable{

 @Override
 public void leisureSports() {
  System.out.println("도쿄타워 번지점프 투어");
  
 }

 @Override
 public void sightseeing() {
  System.out.println("오사카 관람 투어");
  
 }

 @Override
 public void food() {
  System.out.println("초밥 투어");
  
 }
 
 
}

class TourGuide{   
 //private Providable tour = new KoreaTour();  //구현 객체
 private Providable tour;
 TourGuide(){
  // 생성자
  //1. 리턴값이 없다
  //2. 클래스이름과 동일한 이름을 사용한다.
  //3. new라는 연산자와 함께 사용하여 인스턴스 객체를 힙메모리에 생성한다.
  // 기본생성자
 }
 TourGuide(Providable tour){ // 매개변수가 있는 생성자
  this.tour = tour;  // this는 본 인스턴스 객체를 말함
        // (멤버변수, 멤버메소드 접근에 사용)
 }
 
 public void leisureSports() {
  tour.leisureSports();
 }

 public void sightseeing() {
  tour.sightseeing();
 }

 public void food() {
  tour.food();
 }
}

public class TripTest {

	public static void main(String[] args) {
		 KoreaTour tour1 = new KoreaTour(); // 구현객체 1
		  JapanTour tour2 = new JapanTour();  // 구현객체 2
		  TourGuide guide = new TourGuide(tour1);
		  guide.leisureSports();
		  guide.sightseeing();
		  guide.food();
		  
		  guide = new TourGuide(tour2);
		  guide.leisureSports();
		  guide.sightseeing();
		  guide.food();

	}
	// 인터페이스 다형성은 코드 재사용성의 장점. +메소드 재사용성.
}
