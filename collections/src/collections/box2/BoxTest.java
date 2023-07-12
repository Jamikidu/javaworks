package collections.box2;

public class BoxTest {

	public static void main(String[] args) {
		
		// 문자형 사용
		Box box1 = new Box();
		box1.set("안녕 안녕 난 지수야~");
		String msg = (String) box1.get();
		System.out.println(msg);
	}

}
