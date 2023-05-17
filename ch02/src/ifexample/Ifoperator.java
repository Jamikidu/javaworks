package ifexample;

public class Ifoperator {

	public static void main(String[] args) {
		// 두 수의 사칙 연산 프로그램 - if문
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("변수가 잘못되었습니다..");
			return;
		}
		System.out.println("결과값은 " + result + "입니다.");

	}

}
