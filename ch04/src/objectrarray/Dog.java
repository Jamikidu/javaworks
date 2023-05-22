package objectrarray;

public class Dog {
	private String dogName;
	private String type;
	
	public Dog() {}  //기본생성자
	
	// 강아지 이름을 입력하는 메서드
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	
	public String getDogName() {
		return dogName;
	}
	
	//강아지 종류를 입력하는 메서드
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
