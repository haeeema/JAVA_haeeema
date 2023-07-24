package Day14.Ex08_Employee;

public class Employee {
	String name;
	int payPerMonth; 
	int commision;
		
	public Employee(String name, int payPerMonth, int commision) {
		this.name = name;
		this.payPerMonth = payPerMonth;
		this.commision = commision;
	}

	int calcTotalPay() {
		int totalPay = 12*payPerMonth + commision;
		return totalPay;
	}
}
