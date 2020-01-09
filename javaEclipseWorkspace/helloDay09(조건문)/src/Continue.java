import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		int money = 10000;       // 내가 가진 돈
		  int mycash ;        // 사용할 돈
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.printf("현재 가진 돈은 %d원 입니다.",money);
		  
		  while(true) {
		   System.out.println("얼마를 사용하시겠습니까");
		   mycash = sc.nextInt();
		   if(!(mycash>=0 && mycash<=money)) {
		    System.out.println("돈이 모자랍니다. 다시 입력");
		    continue;
		   }
		   money-= mycash;
		   System.out.printf("이제 %d원이 남았습니다.",money);
		   if (money==0)break;
		  }
		  System.out.println("모든 돈을 사용했음, 종료");

	}

}
