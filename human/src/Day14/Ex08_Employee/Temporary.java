package Day14.Ex08_Employee;

public class Temporary extends Employee {
	private int workedHour;
	
	public Temporary(String name, int payPerMonth, int commision, int workedHour) {
		super(name, payPerMonth, commision);
		this.workedHour = workedHour;
	}
	
	@Override
	int calcTotalPay() {
		int temp = super.calcTotalPay();
		int tempTotalPay = temp + workedHour*2000;
		return tempTotalPay;
	}
}
