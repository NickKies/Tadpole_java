import java.util.Scanner;

//1. ASSIST사용 클릭
//2. ctrl + shift + o =>한꺼번에 이파일에 있는 import추가
//import java.util.*; //Scanner 클래스를 사용하기 위해서 추가한 부분

public class If_else_if {

	public static void main(String[] args) {
		 int age = 0;
		  int count = 3;
		  Scanner input = new Scanner(System.in); // System.in==> 표준입력==> 키보드에서 친 것을 가져옴.
		  //String tmp = input.nextLine();   // 스캐너 객체가 문자열을 읽어온다.(키보드에서)
		  //age = Integer.parseInt(tmp);  // 가져온 문자열이 정수일 경우 정수로 바꿔서 age변수에 저장
		           // 알파벳이 섞인 경우는 정수로 바꿀 수 없어서 에러발생
		  
		  while(count-->0) {
		   
		   try {  //트라이- 캣치문 => 예외처리(9단원)       
		    age = input.nextInt();
		     
		  
		    if(age>19) {
		     System.out.println("성인입니다.");
		     System.out.println("성인 요금이 적용됩니다");
		    }  
		    //19>=age가 9~19살인 경우
		    else if(age>8) {
		     System.out.println("어린이입니다.");
		     System.out.println("어린이 요금이 적용됩니다.");
		    }  
		    //8>=age인 경우 
		    else {
		     System.out.println("유아입니다.");
		     System.out.println("유아 요금이 적용됩니다.");
		    }
		    
		   }catch(Exception e) {
		    System.out.println("숫자로 나이입력 요망");
		   }
		  }
		  
		  System.out.println("결제를 진행해 주세요");  
		  

	}

}
