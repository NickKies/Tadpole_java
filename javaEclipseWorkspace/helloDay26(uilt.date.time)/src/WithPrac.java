import java.time.LocalDate;

public class WithPrac {

	public static void main(String[] args) {
		  LocalDate id = LocalDate.now();
		  System.out.println(id);
		  LocalDate new_id = id.withYear(1999)
		    .withMonth(8)
		    .withDayOfYear(23);
		    //.withDayOfMonth(23);
		  System.out.println(new_id);

	}

}
