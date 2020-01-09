import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  int sum = 0;
		  int input;
		  
		  while(true) { // 무한 루프( 1depth)
		   System.out.println("더할 숫자를 입력하세요 :(종료하려면 0입력)");  //ln 빼면 줄 안띔
		   input = sc.nextInt();
		   if(input==0) {
		    break; // while문 종료
		   }
		   sum+=input;  // sum=sum+i;
		   System.out.println("input:"+input+",sum="+sum);  //과정
		  }
		  System.out.println("현재까지의 총합= " +sum);

	}

}
