package singleton.car;

public class Cartest {

	public static void main(String[] args) {
		// 자동차 공장 객체 생성
		CarFactory company = CarFactory.getInstance();
		
		Car mySonata = company.createCar();
		Car yourSonata = company.createCar();
		
		// 차 번호 생성
		System.out.println("차량번호: " + mySonata.getcarNum());
		System.out.println("차량번호: " + yourSonata.getcarNum());

	}

}
