package inheritance.airplane;

public class AirPlaneMain {

	public static void main(String[] args) {
		// SuperSonicAirplane 객체 생성
		SuperSonicAriplane sa = new SuperSonicAriplane();
		
		sa.takeOff();
		sa.fly();
		//초음속 비행
		sa.flyMode = SuperSonicAriplane.SUPERSONIC;
		sa.fly();
		//일반비행
		sa.flyMode = SuperSonicAriplane.NORMAL;
		sa.fly();
		
		sa.land();
	}

}
