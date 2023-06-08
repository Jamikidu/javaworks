package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.keyTurnon();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도는: " + speed + "km/h");
	}

}
