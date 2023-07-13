package collections.product;

public class ProductTest {

	public static void main(String[] args) {
		//자료형<클래스, 문자열>
		Product<TV, String> product1 = new Product<>();
		TV tv = new TV();
		product1.setkind(tv);
		product1.setModel("샘숭 스마트TV");
		
		tv.making();
		String tvModel = product1.getModel();
		System.out.println("TV모델: " + tvModel);
		
		// 자동차
		Product<Car, String> product2 = new Product<>();
		Car car = new Car();
		product2.setkind(car);
		product2.setModel("슈퍼카");
		
		car.making();
		String carModel = product2.getModel();
		System.out.println("차종: " + carModel);
	}

}
