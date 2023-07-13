package Day02;

import java.util.Scanner;

public class Ex06_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INPUT : ");
		int number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.print("even");
		} else {
			System.out.print("odd");
		}
		
		sc.close();
	}
}
