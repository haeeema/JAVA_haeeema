package Recap.AbstractEx;

// 추상 클래스
public abstract class PhoneRecap {
	
	// 변수
	public String owner;
	
	// 생성자
	public PhoneRecap(String owner) {
		this.owner = owner;
	}
	
	// method
	public void turnOn() {
		System.out.println("turn on");
	}
	public void turnOff() {
		System.out.println("turn off");
	}
}
