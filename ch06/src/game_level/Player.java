package game_level;

public class Player {

	//필드
	private PlayerLevel level;
	
	//생성자
	public Player() {
		level = new Beginner();
		level.showLevelMessage();
	}
	
	//showLevelMessage()를 변경하는 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	//play 메서드
	public void play(int count) {
		level.go(count);
	}
}
