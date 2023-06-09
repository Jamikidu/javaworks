package collections.set;

public class Student {
	
	String name;
	int age;
	
	//생성자
	public Student(String name) {
		this.name = name;
	}
	
	//hashCode() 재정의
	public int hashCode() { //hashCode() -> 십진수로 출력됨
		return name.hashCode();	//숫자로 반환해 줌
	}
	
	// equals() 재정의
	@Override
	public boolean equals(Object obj) {	//객체인지 확인 명령어 - instanceof
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(std.name.equals(name))	//외부에서 입력된 이름과 이미 저장된 이름이 같으면
				return true;
		}
			
		return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
