package Day08.Ex05_AnonymousObject;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("on");
			}
			
			@Override
			public void turnOff() {
				System.out.println("off");
			}
			
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("volume : " + this.volume);
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(50);
	}
}
