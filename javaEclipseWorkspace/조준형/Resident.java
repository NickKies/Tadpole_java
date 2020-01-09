package homework;

import java.util.Scanner;

public class Resident {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String rsd = "";
		String rsdLastNum = "";
		
		int[] calcNum;
		calcNum = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int[] calcSum;
		calcSum = new int[12];
		int[] rsdNum;
		rsdNum = new int[12];
		
		int total = 0;
		
		System.out.println("##############");
		System.out.println("#본인 인증 프로그램#");
		System.out.println("##############");
		
		System.out.print("주민등록 번호를 적어주세요(- 는 제외): ");
		rsd = sc.next();
		System.out.println("");
		rsdLastNum = rsd.substring(12, 13);
		rsd = rsd.substring(0, 12);
//		System.out.println(rsd);
//		System.out.println(rsdLastNum);
		
		for (int i = 0; i < rsdNum.length; i++) {
			rsdNum[i] = Integer.parseInt(rsd.substring(i, i + 1));
//			System.out.println("test" + rsdNum[i]);
			//확인용
		}
		
		for (int i = 0; i < calcNum.length; i++) {
			calcSum[i] = rsdNum[i] * calcNum[i];
		}
		
		for (int i = 0; i < calcSum.length; i++) {
			total += calcSum[i];
		}
//		System.out.println(total);
		//확인용
//		System.out.println(11 % total);
		total = 11 % total;
		total = 11 - total;
//		System.out.println(total);
		if(total >= 10) {
			total = 10 % total;
		}
		
		if(total == Integer.parseInt(rsdLastNum)) {
			System.out.println("유효한 주민등록번호 입니다!");
		}
		else {
			System.out.println("유효하지 않은 주민등록번호 입니다,  다시 확인해주십시오.");
		}
		
		
	}//end main

}//end class
