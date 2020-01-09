import java.util.Calendar;
import java.util.GregorianCalendar;

public class Utiltest1 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();
		  Calendar b = new GregorianCalendar(); 
		  // 싱글톤을 사용하지 않으려면 그레고리안캘리더 객체를 직접생성==>마찬가지 결과
		  System.out.println(a.toString());
		  System.out.println(b.toString());

	}

}
