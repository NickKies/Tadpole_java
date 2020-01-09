
public class NestedExceptionTest {

	public static void main(String[] args) {
		java.util.Date d = new java.util.Date();
		  System.out.println(d.getTime());
		  
		  
		  try {
		   System.out.println("외부 try...");
		   
		   try {
		    System.out.println("내부 try...");
		    Exception e = new Exception();
		    throw e;
		   }catch(Exception e){
		    System.out.println("(내부try-catch) exception"+e);
		    System.out.println("예외 던지기 한번더:");
		    throw e;    
		   }finally{
		    System.out.println("finally 구문 출력");
		   }
		  }catch(Exception e) {
		   System.out.println("(외부 try-catch)Catch exception:"+e);
		  }
		  System.out.println("종료");

	}

}
