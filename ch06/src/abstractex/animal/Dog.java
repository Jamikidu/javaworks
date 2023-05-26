package abstractex.animal;

public class Dog extends Animal {

	public Dog() {
		this.kind = "킹아지";
	}
	
	@Override
	public void sound() {
		System.out.println("멍~멍");
	}
	
	
}
