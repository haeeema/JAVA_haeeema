package Day02;

import java.util.Scanner;

public class Ex21_Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = input; i <= j; j--) {
				System.out.print("*");				
			}
			System.out.println();
		}
		sc.close();
	}
}
