package Day08.Ex01_Phone;

// 추상 클래스
public abstract class Phone {
	
	// 변수
	public String owner;
	
	// 생성자
	public Phone(String owner) {
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

