
public class Xor_practice {

	public static void main(String[] args) {
		int a, b;     // (128 64 32 16 8 4 2 1)
		  a = 15;      //    0  0  0  0 1 1 1 1 => 8+4+2+1 =15
		  b = 5;      //    0  0  0  0 0 1 0 1 => 4+1 = 5
		  
		  System.out.println(a|b);    //OR  0  0  0  0 1 1 1 1 => 15
		  System.out.println(a&b); //AND 0  0  0  0 0 1 0 1 => 5
		  System.out.println(a^b); //XOR 0  0  0  0 1 0 1 0 => 10
		  
		  System.out.println(a>>2);   //>>2(0)(0) 0  0 0 0 1 1 => 3 쉬프트 연산자
		  System.out.println(b<<4); //<<4 0  1  0  1(0)(0)(0)(0) => 80 

	}

}
