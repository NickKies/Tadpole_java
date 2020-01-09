
public class Array2 {

	public static void main(String[] args) {
		// 시험점수의 평균 구하기
	    int[] student = { 100, 95, 90, 88, 93};
	    int sum = 0;         // 합계
	    double avg = 0;         // 평균
	    
	    //for문 사용 => 배열과 for문은 서로 효율적 구조로 되어있음
	    for(int i = 0; i <student.length; i++) {
	     // 초기식 ; 조건식 ; 증감식
	     //제어문자 ; 언제끝나?;제어문자에 변화를 주는식
	     sum += student[i];
	     // sum = sum + student[i];
	     // i=0) 0   +100 = 100
	     // i=1)100 + 95 = 195
	     // ...
	     // i=5)466 + 100 = 566
	     // i=6) 조건식==> 6<6?? false ==> for 반복문 종료
	     
	    }
	    avg =(double)sum/student.length;
	    
	    System.out.printf("합계: %d, 평균: %.1f 점 ", sum,avg);

	}

}
