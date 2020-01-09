import java.util.Scanner;

public class If_if {

	public static void main(String[] args) {
		String id, password;
		  boolean success = false ;
		  Scanner input = new Scanner(System.in);   //scanner 객체 만듦
		   //ctrl+shift+o => import가능
		  //System.out.println("아이디를 입력해주세요:");
		  //id = input.nextLine();       // 스캐너객체의 메소드(nextLine()) 호출
		  /*******
		   * 자료처리부
		   */
		  
		  //while(true && success==false) { //참이므로 계속반복
		  exitLabel_k:      // 레이블, break와 같이 쓰이면 ==> break label
		           // break는 가장 가까운 반복문만 빠져나올 수 있다.
		  while(true && success==false) {
		   System.out.println("아이디를 입력해주세요:");
		   id = input.nextLine();       // 스캐너객체의 메소드(nextLine()) 호출
		   /*****
		    * 아이디 검증부
		    */
		   if(id.equals("java")) {     // string의 equals() 메소드 호출
		    // true 인 경우
		    System.out.println("id 일치");    // 1. println
		    System.out.printf("id:%s\n", id);   // 2. printf 언어의 그것
		   
		    while(true) {
		     System.out.print("비밀번호를 입력해주세요:");  // 3. print 한줄 안띔
		     password = input.nextLine();
		     if(password!=null && !password.equals("")){
		      System.out.println("비밀번호를 입력햇음");
		    /******************
		     * 비밀번호 검증부
		     */
		      if(password.equals("abc123")) {
		       System.out.println("password 일치");
		       System.out.println("로그인 성공!");
		       //success = true;   // while문 빠저나가기위한 플래그
		       break exitLabel_k ;        // 안쪽 while 반복문을 빠져나가고 더이상 입력을 받지 않음
		      }else {
		      System.out.println("password 불일치");
		      }
		     }else {
		    System.out.println("비밀번호 미입력");
		     }      
		    }
		   }else {
		    System.out.println("id 불일치");
		   }
		  }
		  System.out.println("the end"); 

	}

}
