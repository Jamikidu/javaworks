package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수/짝수를 판별하는 프로그램을 작성하세요
		// (조건 연산자 활용 - 예)
		// 예외(Exception) : 프로그램 실행시 오류
		// try ~ catch 구문
		try {
			Scanner scan = new Scanner(System.in);
			int num;
			
			System.out.print("숫자를 입력하세요: ");
			num = scan.nextInt();
			
			
			// String result = (num % 2 == 0) ? "짝수" : "홀수";  --> 조건 연산자 활용구문
			String result = "";
			if(num % 2 == 0) {
				result = "짝수입니다.";
			}else {
				result = "홀수입니다.";
			}
			System.out.printf("결과 : %s \n", result);
	
			scan.close();
		}catch(Exception e) {
			System.out.println("숫자를 입력해주세요");
		}
	}

}
