import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String answer ;      // while이랑 다르게 처음 한 번은 실행된다.   
		  int count = 0;
		  
		  do {
		   System.out.println("음악을 재생하시겠습니까?");
		   answer = sc.nextLine();
		   
		   if(answer.equals("Y") || answer.equals("y"))
		   System.out.printf("음악을 %d번 재생했습니다. \n",++count);
		       
		  }while(answer.equals("Y") || answer.equals("y"));
		  System.out.println("재생종료");

	}

}
