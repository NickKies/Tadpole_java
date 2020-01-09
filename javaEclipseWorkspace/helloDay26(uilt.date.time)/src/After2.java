import java.time.LocalDateTime;

public class After2 {

	public static void main(String[] args) {
		 LocalDateTime idt = LocalDateTime.of(2017, 12,8,11,39,58,615000000);
		  System.out.println(idt);
		  
		  LocalDateTime end_time = LocalDateTime.of(2017, 6,24,12,00);
		  System.out.println(end_time);
		  
		  if(idt.isAfter(end_time)) {
		   System.out.println("유통기한이 지났습니다.");
		  }else {
		   System.out.println("유통기한이 지나지 않았습니다.");

	}

}
}