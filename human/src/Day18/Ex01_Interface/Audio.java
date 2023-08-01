package Day18.Ex01_Interface;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("Audio volume : " + this.volume);
	}
	
	public void amp() {
		System.out.println("From audio class");
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute)
			System.out.println("Audio mute on");
		else
			System.out.println("Audio mute off");
	}
}
