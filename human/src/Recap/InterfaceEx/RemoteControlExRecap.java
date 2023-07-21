package Recap.InterfaceEx;

public class RemoteControlExRecap {
	public static void main(String[] args) {
		// 인터페이스타입 객체명 = new 구현클래스();
		RemoteControlRecap tvRc = new TelevisionRecap();
		
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
	}
}
