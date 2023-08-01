package Day18.Ex03_Instanceof;

public class Driver {
	
	// 생성자
	public void driver(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
