import java.util.Arrays;

public class ArrayApp2 {

	public static void main(String[] args) {
		String[]a= {"자바","안녕","세계"};
		  int scores[] = {100,200,500,400};
		  //이것을 향상된 for 문으로 출력하세요
		  
		  /*for(int i:scores) {
		   System.out.println(i+"");
		  }*/
		  
		  
		  System.out.println("\n1.일반적인 for");
		  for(int i=0;i<a.length;i++) {
		   System.out.print(a[i]+"");
		  } 
		  System.out.println();
		  System.out.println("2.foreach=>향상된 for문");  
		  for(String i:a) {
		   System.out.print(i+"");
		  }
	}

}
