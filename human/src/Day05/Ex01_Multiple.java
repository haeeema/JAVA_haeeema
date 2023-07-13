package Day05;

import java.util.Scanner;

public class Ex01_Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num%3 == 0) {
			System.out.print("3의 배수입니다.");
		} else {
			System.out.print("3의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
