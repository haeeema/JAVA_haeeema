package Day14.Ex02_Car;

public class YourCarTest {
	public static void main(String[] args) {
		Car yourCar = new Car("grander", "black", 2500, 60);
		
		String carName = yourCar.getCarName();
		String carColor = yourCar.getCarColor();
		int carSize = yourCar.getCarSize();
		int velocity = yourCar.getVelocity();
		
		System.out.println("차정보 : ");
		System.out.println(yourCar);
	}
}
