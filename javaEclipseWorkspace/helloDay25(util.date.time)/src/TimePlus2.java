import java.time.LocalDateTime;

public class TimePlus2 {

	public static void main(String[] args) {
		LocalDateTime id= LocalDateTime.of(2017,6,6,2,3,50);
		  System.out.println("정해진 시간:"+id);
		  LocalDateTime id2= id
		    .minusHours(5)
		    .plusMinutes(30)
		    .minusSeconds(4);
		  
		  System.out.println("변경시간:"+id2);
		  LocalDateTime id3 = id2.minusHours(24);
		  System.out.println("자동변환 시간:"+id3);

	}

}
