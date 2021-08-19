package hw_ch4;
//구구단 짝수단만 출력
//가희님 : 구구단 홀수단만 출력하게끔 밑에 코드 작성해서 수정해주세요.
//정현님 : Scanner로 입력받아 원하는 단수를 출력하도록 코드 수정해주세요.

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단수 >> ");
		int dan = sc.nextInt();
		

			for(int times = 1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
	}

}
