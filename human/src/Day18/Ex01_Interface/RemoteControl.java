package Day18.Ex01_Interface;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// Abstract method
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
//	void setMute(boolean mute);
	
	default void setMute(boolean mute) {
		if (mute)
			System.out.println("Mute on");
		else
			System.out.println("Mute off");
	}
	
	static void changBattery() {
		System.out.println("Change battery");
	}
}
