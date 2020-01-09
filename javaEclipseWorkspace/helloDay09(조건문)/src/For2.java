
public class For2 {

	public static void main(String[] args) {
		int sum = 0;    // 총 합을 담을 변수
		  for(int i=0; i<=10; i++) {
		 // for( 초기식; 조건식; 증감식)
		  // 무한루프 표현 == for(;;){...}
		  //    while(true){...}와 같은 기능
		   sum+=i;     //sum = sum +i; +=복합대입연산자
		   System.out.println("i="+i+",sum="+sum);
		  }

	}

}
