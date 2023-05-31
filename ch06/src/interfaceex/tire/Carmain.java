package interfaceex.tire;

public class Carmain {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car();
		myCar.run();
		
		System.out.println("==============================");
		
		//앞바퀴 2개 교체
		myCar.frontLeftTire = new KumTire();
		myCar.frontRightTire = new KumTire();
		
		myCar.run();
	}

}
