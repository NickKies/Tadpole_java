import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String answer ;      // while�̶� �ٸ��� ó�� �� ���� ����ȴ�.   
		  int count = 0;
		  
		  do {
		   System.out.println("������ ����Ͻðڽ��ϱ�?");
		   answer = sc.nextLine();
		   
		   if(answer.equals("Y") || answer.equals("y"))
		   System.out.printf("������ %d�� ����߽��ϴ�. \n",++count);
		       
		  }while(answer.equals("Y") || answer.equals("y"));
		  System.out.println("�������");

	}

}
