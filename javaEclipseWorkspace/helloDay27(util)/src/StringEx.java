
public class StringEx {

	public static void main(String[] args) {
		String str = "Java Programming";
		  str = str.concat(" is good"); //문자열 연결
		  System.out.println(str);

		  char ch = str.charAt(5);
		  System.out.printf("%c\n",ch);
		  
		  str = "Java";
		  System.out.println(str.length());
		  
		  System.out.println(str.indexOf("av"));
		  
		  System.out.println(str.equals("Java"));
		  
		  str = "http://myhome.edud.kr/d/c/b/a";
		  String arr[] = str.split("/");
		  for(String i:arr)
		   System.out.println(i);
		  
		  str = "Java Programmer is Good";
		  String str2 = "Java programmer is good";
		  System.out.println(str.equalsIgnoreCase(str2));
		  
		  str = str.join("-",str.split(" "));
		  System.out.println(str);
		  
		  str = "   Java Programmer is Good      ";
		  System.out.println(str);
		  str = str.trim();
		  System.out.println(str);
		  
		  String b = String.valueOf(199);
		  System.out.println(b);
		  String c = String.format("%s:%d원,복리%.3f%%", "입금안내",10000,1.3);
		  System.out.println(c);

	}

}
