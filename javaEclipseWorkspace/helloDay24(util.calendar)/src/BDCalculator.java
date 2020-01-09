import java.util.Calendar;

public class BDCalculator {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		  Calendar ysBD = Calendar.getInstance();
		  Calendar jmBD = Calendar.getInstance();
		  Calendar yjBD = Calendar.getInstance();
		  Calendar gbBD = Calendar.getInstance();

		  
		  System.out.println("태어난지");
		  ysBD.set(1992,2,1);
		  long diff = today.getTimeInMillis()-ysBD.getTimeInMillis();
		  System.out.println("윤성 :"+diff/(24*60*60*1000)+"일");
		  
		  jmBD.set(1993,2,31);
		  diff = today.getTimeInMillis()-jmBD.getTimeInMillis();
		  System.out.println("종명 :"+diff/(24*60*60*1000)+"일");
		  
		  yjBD.set(2017,4,13);
		  diff = today.getTimeInMillis()-yjBD.getTimeInMillis();
		  System.out.println("이준 :"+diff/(24*60*60*1000)+"일");
		  
		  gbBD.set(2019,7,23);
		  diff = today.getTimeInMillis()-gbBD.getTimeInMillis();
		  System.out.println("꿀복 :"+diff/(24*60*60*1000)+"일");
		  

	}

}
