import java.util.Calendar;

public class UtilTest2 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance(); 
		  // 싱글톤, 객체를 getter로 넘겨받음 ==> 중앙에서 하나로 공유(클래스 변수, 클래스 메소드)
		  // 추상 클래스 Calendar ==> getInstance()를 호출하면 GregorianCalendar 인스턴스를 생성한다.
		  // 싱글톤 개발 패턴 ==> 객체를 사용할 때 각각 인스턴스를 생성해서 사용x 하나의 인스턴스를 가지고 사용하는 개발 패턴중 하나
		  // Calendar는 대표적 싱글톤 클래스
		  
		  int year = a.get(Calendar.YEAR); // 데이터를 얻어올때 get() 메소드 사용
		  int month = a.get(Calendar.MONTH)+1; //************주의!
		  int date = a.get(Calendar.DATE);
		  System.out.println(year+"년"+month+"월"+date+"일");
		  System.out.println(a.get(Calendar.DAY_OF_WEEK)); // 일요일:1 월요일:2 화요일3...토요일7
		  // 요일(java.time패키지) 월요일:1 화요일:2...일요일:7
		  
		  System.out.println("이번 년도에서 오늘이 몇 일째인가?");
		  System.out.println(a.get(Calendar.DAY_OF_YEAR));
		  System.out.println("이번 달은 며칠까지 있는가?");
		  System.out.println(a.getActualMaximum(Calendar.DATE));
		  System.out.println(a.getActualMaximum(Calendar.MONTH)+1);
		  // getActualMaximum(): 대상 매개변수의 최대치 출력

	}

}
