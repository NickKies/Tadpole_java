import java.time.LocalDate;

public class Leap {

	public static void main(String[] args) {
		LocalDate id = LocalDate.now();
		  LocalDate new_id;
		  int count = 0;
		  
		  for(int i=1900; i<=2100; i++){
		   new_id = id.withYear(i);
		   if(new_id.isLeapYear()) {
		    System.out.println(new_id.getYear()+"은 윤년입니다.");
		    count++;
		   }
		  }

		  System.out.println("1900년부터 2100년까지 윤년은 총"+count+"번 있습니다.");

	}

}
