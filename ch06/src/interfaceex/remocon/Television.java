package interfaceex.remocon;

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
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIX_VOLUME) {
			this.volume = RemoteControl.MIX_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.printf("볼륨을 %d(으)로 설정했습니다.\n",this.volume);
	}

}
