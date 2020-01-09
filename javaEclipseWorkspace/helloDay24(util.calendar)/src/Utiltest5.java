import java.util.Calendar;
import java.util.Date;

public class Utiltest5 {

	public static void main(String[] args) {
		// 캘린더 ==>데이트
		  Calendar calendar = Calendar.getInstance();
		  Date date = calendar.getTime();
		  System.out.println(date);
		  
		  // 캘린더 ==> (밀리초 단위)
		  calendar.setTime(date);
		  long time = calendar.getTimeInMillis();
		  System.out.println(time);
		  
		  // long(밀리초단위)==> 캘린더
		  calendar.setTimeInMillis(time);
		  date = calendar.getTime();
		  System.out.println(date);

	}

}
