package abstractex.template;

public class CarMain {

	public static void main(String[] args) {
		// myCar 부모타입으로 객체 생성
		Car myCar = new AICar();
		
		myCar.run();
	}

}
