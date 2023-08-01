package Day18.Ex01_Interface;

public class SmartTelevision implements RemoteControl, ISearchable {
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + " searching...");
	}

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
		
		System.out.println("Smart television volume : " + this.volume);
	}
}
