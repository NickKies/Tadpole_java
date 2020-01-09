import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  //String answer = sc.nextLine();    // 재생이 먼저??
		  String answer = "Y";
		  //~번 재생했습니다.
		  int count = 0;
		  
		  while(answer.equals("Y") || answer.equals("y")) {
		   System.out.println("음악을 재생하시겠습니까?");
		   answer = sc.nextLine();
		   
		   if(answer.equals("Y") || answer.equals("y"))
		   System.out.printf("음악을 %d번 재생했습니다.",++count);
		    // ++count ++는 증가연산자이자 단항연산자로 덧셈을 먼저하고
		    // 다른 수식과 결합한다.
		   
		  }
		  System.out.println("재생종료");

	}

}
