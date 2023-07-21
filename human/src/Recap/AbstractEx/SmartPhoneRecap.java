package Recap.AbstractEx;

public class SmartPhoneRecap extends PhoneRecap {
	
	public SmartPhoneRecap(String owner) {	
		super(owner);
	}	
	
	public void internetSearch() {
		System.out.println("search internet");
	}
}
