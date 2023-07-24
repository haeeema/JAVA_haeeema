package Day14.Ex01_Inheritance;

public class DMBCellPhone extends CellPhone {
	
	int channel;

	public DMBCellPhone() {
		System.out.println(model);
		System.out.println(color);
		System.out.println(channel);
	}
	public DMBCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	// 오버라이딩
	public void powerOn() {
		System.out.println("DMB Power on");
	}
	
	void turnOnDmb() {
		System.out.println("Channel : " + channel);
	}

	void turnOffDmb() {
		
	}
	
	void changeChannelDmb(int _channel) {
		this.channel = _channel;
		System.out.println("Channel : " + channel);
	}
}
