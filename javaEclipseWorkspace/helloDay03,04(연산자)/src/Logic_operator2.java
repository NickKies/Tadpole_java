
public class Logic_operator2 {

	public static void main(String[] args) {
		 int a=10;         // 변수의 선언과 초기화
		  System.out.println(5<a&&a<15);     // 참 이고 참 => 참
		  System.out.println((5<a&&a<15)&&a%2==0); // (참 이고 참) 이고 참 => 참
		  
		  a=4;          // = : 대입연산자 => 값만 바꾸어 주어 재사용
		             // int a = 4 라고 할 수 없음
		  
		  System.out.println((5<a&&a<15)&&a%2==0); // (거짓 이고 참) 이고 참 => 거짓
		  System.out.println((5<a&&a<15)||a%2==0); //(거짓 이고 참) 또는 참 => 참!
		  
		   // 효율적인 연산(short circuit evaluation) <- 논리 연산자에서 해당
		   // &&앞에서 거짓이 나오면 뒤에는 계산하지 않음 -> ()를 사용해서 || 써보자.

	}

}
