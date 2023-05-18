package arrays;

public class Array2 {

	public static void main(String[] args) {
		// 문자열혈 배열 선언 및 사용
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		// "Sonata"를 검색하시오
		System.out.println(cars[1]);
		
		// K7을 BMW로 변경하시오
		cars[3] = "BMW";
		System.out.println(cars[3]);
		
		// 전체 출력
		for(int car=0; car<cars.length; car++) {
			System.out.print(cars[car] + " ");
		}
		System.out.println();
		
		//향상된 for문
		//for(자료형 변수 : 배열이름){}
		for(String car : cars) {
			System.out.print(car + " ");
		}

	}

}
