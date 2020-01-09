import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		 int book = 0 ;
		  Scanner input = new Scanner(System.in);
		  System.out.print("몇권 읽었습니까? :");
		  book =input.nextInt();
		  System.out.printf("당신은 %d권 읽었습니다.\n", book);
		  
		  book = book /10 ;
		  switch(book) {
		   case 0: //10권 미만
		    System.out.println("조금 더 노력하세요!");
		    break;
		   case 1: // 10권 이상 20권 미만
		    System.out.println("책 읽는 것을 즐기시는 분이시네요!");
		    break;
		   case 2: // 20권 이상 30권 미만
		    System.out.println("책을 사랑하는 분이시네요!");
		    break;
		   default: //30권 이상
		    System.out.println("당신은 다독왕입니다");
		  }
		 }
		
	/******
	 *  case, default => 레이블
	 * break 라벨(레이블) 비슷하게 레이블을 정해놓고 break문에 사용되면 그곳으로 이동하는 형태의 레이블
	 * break는  한 단계 밖으로만 나갈 수 있다. => 조건식에 변화를 주거나 break 레이블을 사용한다.
	 * ex) 
	 * exitLabel:
	 * while(){... 
	 *   ...
	 *   while(){
	 *    ...
	 *    ...
	 *    break exitLabel;
	 *   }
	 * }
	 * 여기서 흐름이 상단 레이블을 빠져나옴***/

	}


