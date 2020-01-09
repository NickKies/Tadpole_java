import java.util.Arrays;

public class ArrayApp {

	public static void main(String[] args) {
		 int a[] = {1,2,3,4,5,6,7,8,9,10};
		  int b[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		  
		  System.arraycopy(a, 0, b, 5, 10);
		  // a의 0번 부터 b에 5번(6번쨰자리)을 시작으로 10개 복사
		  System.out.println("[0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15]");
		  System.out.println(Arrays.toString(b));

	}

}
