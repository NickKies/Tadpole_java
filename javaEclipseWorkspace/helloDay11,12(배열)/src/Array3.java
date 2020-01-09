
public class Array3 {

	public static void main(String[] args) {
		int student[][] = { {20,20,20},{100,100,100},{25,100,90} };  // 3행3열
		  String [][]info = { {"주유리","대전 서구"},{"유용준","서초구"},{"김희곤","판문점"}} ; // 3행 2열
		  System.out.println("이름 \t 주소 \t 국어 \t 영어 \t 수학");
		   
		  for(int i=0; i<student.length; i++) {
		   System.out.printf("%s \t%s \t",info[i][0], info[i][1]);
		   for(int j=0;j<student.length;j++) {
		    System.out.printf("%d \t",student[i][j]);
		    }
		   System.out.println();
		  }
		  
		  System.out.println("[종료]");

	}

}
