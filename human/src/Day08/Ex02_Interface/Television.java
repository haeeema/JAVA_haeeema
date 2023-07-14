package Day08.Ex02_Interface;

// 인터페이스 구현 키워드 : implements
public class Television implements RemoteControl {
	
	private int volume;
	
	// abstract method of interface
	@Override
	public void turnOn() {
		System.out.println("Turn on the TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the TV");		
	}

	@Override
	public void setVolume(int volume) {
		// 유효성 검사
		// 볼륨 최대, 최소값을 넘지 못하게 지정
		if ( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV volume : " + this.volume);
	}
	
}
