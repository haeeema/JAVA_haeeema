package Day14.Ex08_Employee;

public class EmpTest {
	public static void main(String[] args) {
		String name;
		int totalPay;
		
		Regular Lee = new Regular("Lee", 2000000, 5000000);
		Temporary Hong = new Temporary("Hong", 1500000, 0, 500);
		
		System.out.println("PAYMENT");
		
		name = Lee.name;
		totalPay = Lee.calcTotalPay();
		System.out.println("Name : " + name + ", \tPayment : " + totalPay);
		
		name = Hong.name;
		totalPay = Hong.calcTotalPay();
		System.out.println("Name : " + name + ", \tPayment : " + totalPay);
	}

}
