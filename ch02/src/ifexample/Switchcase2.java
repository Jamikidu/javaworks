package ifexample;

public class Switchcase2 {

	public static void main(String[] args) {
		// case문 동시에 사용하기
		int month = 0;	//'월'을 저장할 변수
		int day = 0;	//'일'을 저장할 변수
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			return;  //프로그램자체가 즉시 종료(밑에 구문도 출력안됨)
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
		System.out.printf(month + "월은 " + day + "일까지 있습니다.");

	}

}
