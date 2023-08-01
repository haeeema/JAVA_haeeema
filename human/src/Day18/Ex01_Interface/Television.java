package Day18.Ex01_Interface;

public class Television implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Turn on the television.");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the television.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("Television volume : " + this.volume);
	}
	
	public void print() {
		System.out.println("From televison class");
	}
}
