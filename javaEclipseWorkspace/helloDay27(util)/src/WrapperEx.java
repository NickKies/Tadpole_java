
public class WrapperEx {

	public static void main(String[] args) {
		 // 래퍼클래스 : 자료형에 대한 클래스
		  // 기본 자료형과 다르게 클래스이기 때문에 인스턴스를 만들어 활용함
		  //다양한 메서드 사용 가능
		  
		  Boolean b = new Boolean(true);
		  Character c = new Character('c');
		  Byte d = new Byte((byte)15);
		  Short e = new Short((short)2);
		  Integer f = new Integer(3333);
		  Long g = new Long(444);
		  Double h = new Double(155.4);
		  Float i = new Float(123.4);
		  
		  // 기본자료형으로 변환
		  int a = f.intValue();
		  double j = h.doubleValue();
		  
		  //문자열을 기본자료형으로 변환
		  a = Integer.parseInt("1000");
		  j = Double.parseDouble("3.14");
		  
		  int m = 35;
		  String s = Integer.toString(m); // 문자열로 변환
		  System.out.println(s+35);  // 문자열로 연결
		    
		  // 문자열을 래퍼클래스로 변환
		  Float o = Float.valueOf("3.159");
		  Integer n = Integer.valueOf("1100");
		  
		  Integer p = 100; // 1.5 버전부터 나온 오토 박싱
		  int q = 3;
		  q = q + n;
		  System.out.println(q); // 1.5 버전부터 나온 언박싱

	}

}
