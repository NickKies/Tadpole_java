
public class Operator_ch3 {

	public static void main(String[] args) {
		int a = 1;
		 System.out.println(a);  // a는 1 
				  
		a++;      // 세미콜론을 만나면 증가 a=2
				  
		System.out.println(a);  // a=2
		System.out.println(++a); // 덧셈을 먼저한다. a=3
		System.out.println(a++); // 결합을 먼저해서 앞에 있던 값 3  이찍히고 세미콜론을 만나 1증가 ==> 4
		System.out.println(a);  // 앞에 끝날 때 가졌던 값 4가 찍힘
	
	}

}
