package Day01;

import java.util.Scanner;

public class Ex13_Boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("POWER : ");
		
		boolean on = sc.nextBoolean();
		
		System.out.println("ON : " + on);
		
		if (on) {
			System.out.println("POWER ON");
		} else {
			System.out.println("POWER OFF");
		}
		
		sc.close();
	}
}

