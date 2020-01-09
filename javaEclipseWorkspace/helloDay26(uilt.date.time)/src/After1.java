import java.time.LocalDateTime;

public class After1 {

	public static void main(String[] args) {
		 LocalDateTime idt1 = LocalDateTime.of(2010, 1,1,12,23,23,444000000);
		  System.out.println(idt1);
		  
		  LocalDateTime idt2 = LocalDateTime.of(2010, 12,25,1,12,2,232000000);
		  System.out.println(idt2);
		  
		  System.out.println(idt1.isAfter(idt2));
		  System.out.println(idt1.isBefore(idt2));
		  System.out.println(idt1.isEqual(idt2));

	}

}
