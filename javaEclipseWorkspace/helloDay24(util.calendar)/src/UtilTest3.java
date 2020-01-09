import java.util.Calendar;

public class UtilTest3 {

	public static void main(String[] args) {
		 Calendar today = Calendar.getInstance();
		  Calendar endOfYear = Calendar.getInstance();
		  Calendar christmas = Calendar.getInstance();
		  
		  
		  endOfYear.set(Calendar.MONTH,11);
		  endOfYear.set(Calendar.DATE,31);
		  long diff = endOfYear.getTimeInMillis()-today.getTimeInMillis();
		  System.out.println("연말까지 남은 날:"+diff/(24*60*60*1000)+"일");
		  
		  christmas.set(2019,11,25);
		  diff = christmas.getTimeInMillis()-today.getTimeInMillis();
		  System.out.println("크리스마스까지 남은 날:"+diff/(24*60*60*1000)+"일");
		 
		  System.out.println(today.getTimeInMillis());

	}

}
