package enums;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class EnumLever {
	

	public static void main(String[] args) {
		Level level = Level.HIGH;
		
		switch(level) {
		case LOW : System.out.println("LOW level"); break;
		case MEDIUM : System.out.println("MEDIUM level"); break;
		case HIGH : System.out.println("HIGH level"); break;
		default : System.out.println("레벨이 없습니다.");
		
		}

	}

}
