import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class TemproralPrac {

	public static void main(String[] args) {
		 LocalDateTime idt = LocalDateTime.of(2017,12,8,11,39,17,540000000);
		  System.out.println(idt);
		  LocalDateTime new_idt;
		  
		  new_idt = idt.with(TemporalAdjusters.firstDayOfYear());
		  System.out.println("올해의 첫 번째 날"+new_idt);
		  new_idt = idt.with(TemporalAdjusters.lastDayOfYear());
		  System.out.println("올해의 마지막 날"+new_idt);
		  
		  new_idt = idt.with(TemporalAdjusters.firstDayOfMonth());
		  System.out.println("이번 달의 첫 번째 날"+new_idt);
		  new_idt = idt.with(TemporalAdjusters.lastDayOfMonth());
		  System.out.println("이번 달의 마지막 날"+new_idt);
		  
		  new_idt = idt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		  System.out.println("이번달의 첫 월요일"+new_idt);
		  new_idt = idt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		  System.out.println("이번달의 마지막 일요일"+new_idt);
		  
		  new_idt = idt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		  System.out.println("돌아오는 금요일"+new_idt);
		  new_idt = idt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		  System.out.println("오늘을 포함한 다음 금요일"+new_idt);
		  
		  new_idt = idt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		  System.out.println("지난 월요일"+new_idt);
		  new_idt = idt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		  System.out.println("오늘을 포함한 지난 월요일"+new_idt);
		  

	}

}
