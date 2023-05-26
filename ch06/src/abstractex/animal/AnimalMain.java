package abstractex.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// 고양이 객체 생성
		Cat cat = new Cat();
		cat.showInfo();
		cat.breathe();
		//cat.sound();
		
		Animal dog = new Dog();
		//dog.sound();
		dog.showInfo();
		dog.breathe();
		
		//animalSound() 호출
		animalSound(cat);
		animalSound(dog);
		
		
	}
	
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
