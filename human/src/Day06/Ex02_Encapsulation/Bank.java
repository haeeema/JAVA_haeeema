package Day06.Ex02_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation(0, "국민은행", "123123-123123-123123", "박하민");
		
		//ec.deposit = 10000000;
		ec.setDeposit(1000000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("잔액" + money);
	}
}
