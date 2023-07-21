package Recap.InterfaceEx;

public interface RemoteControlRecap {
	// 상수
	// - 인터페이스 변수는 public static final로 자동으로 선언된다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// abstract method
	// - public abstract를 생략하고 작성할 수 있다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default method
	// 구현 객체에 할당될 인스턴스 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("mute on");
			setVolume(0);
		} else {
			System.out.println("mute off");
			setVolume(5);
		}
	}
	
	// static method
	// 구현 객체가 없어도 인터페이스만으로도 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("Change Battery");
	}
}
