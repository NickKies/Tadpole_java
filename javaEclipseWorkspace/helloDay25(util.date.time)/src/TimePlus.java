import java.time.LocalDate;
import java.util.Scanner;

public class TimePlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("년도를 입력하세요 : ");
		  int yyyy = sc.nextInt();
		  
		  System.out.println("월를 입력하세요 : ");
		  int MM = sc.nextInt();
		  
		  System.out.println("날짜를 입력하세요 : ");
		  int dd = sc.nextInt();
		  
		  LocalDate id = LocalDate.of(yyyy,MM,dd);
		  System.out.println("정해진 시간 : "+id);
		  LocalDate id2 = id
		   .minusYears(2)
		   .plusMonths(3)
		   .minusDays(4);
		  System.out.println(id2);
		  
		  LocalDate id3 = id2.minusDays(3);
		  System.out.println(id3);
		  
		  LocalDate id4 = id.plusWeeks(3);
		  System.out.println(id4);

	}

}
