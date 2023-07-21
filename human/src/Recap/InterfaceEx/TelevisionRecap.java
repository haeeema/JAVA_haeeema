package Recap.InterfaceEx;

public class TelevisionRecap implements RemoteControlRecap {

	private int volume;

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
		if (volume > RemoteControlRecap.MAX_VOLUME) {
			this.volume = RemoteControlRecap.MAX_VOLUME;
		} else if (volume < RemoteControlRecap.MIN_VOLUME) {
			this.volume = RemoteControlRecap.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Speaker volume : " + this.volume);
	}
}
