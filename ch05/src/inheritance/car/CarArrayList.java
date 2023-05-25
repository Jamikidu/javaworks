package inheritance.car;

import java.util.ArrayList;

public class CarArrayList {
	

	public static void main(String[] args) {
		// 자동차 3대 생성 - ArrayList에 저장
		ArrayList<Car> carList = new ArrayList<>();
		
		// 자동차 객체 생성
		Car car1 = new Car("차1", 1000);
		Car car2 = new Car("차2", 2000);
		Car car3 = new Car("차3", 3000);
		
		// 객체 저장
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		
		
		/* 간략하게 하는 방법
		carList.add(new Car("차1", 1000));
		carList.add(new Car("차2", 2000));
		carList.add(new Car("차3", 3000));
		*/
		
		// 특정한 요소 출력
		System.out.println(carList.get(1).carInfo());
		
		// 객체리스트 전체 출력
		for (int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i).carInfo());
		}
		
	}

}
