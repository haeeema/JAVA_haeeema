package Day14.Ex02_Car;

public class Car {
	private String carName;
	private String carColor;
	private int carSize;
	private int velocity;
	
	// 생성자 정의
	public Car() {
		
	}
	
	public Car(String carName, String carColor, int carSize, int velocity){
		 setCarName(carName);
		 setCarColor(carColor);
		 setCarSize(carSize);
		 setVelocity(velocity);
	}

	// getter, setter
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarSize() {
		return carSize;
	}

	public void setCarSize(int carSize) {
		this.carSize = carSize;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void speedUp() {
		velocity = velocity + 1;
	}

	public void speedDown() {
		velocity = velocity - 1;
		if (velocity < 0)
			velocity = 0;
	}

	public void stop() {
		velocity = 0;
	}

	public void park() {
		System.out.println("주차합니다.");
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", carSize=" + carSize + ", velocity=" + velocity
				+ "]";
	}
}