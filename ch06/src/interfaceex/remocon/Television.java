package interfaceex.remocon;


//Televison은 RemoteControl을 구현한 클래스임(구현 클래스)
public class Television implements RemoteControl{
	
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {	//최대볼륨
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {	//최소볼륨
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.printf("볼륨을 %d(으)로 설정했습니다.\n",this.volume);
	}

}
