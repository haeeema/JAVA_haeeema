package Day02;

import java.util.Scanner;

public class Ex05_ternaryOperator {
	public static void main(String[] args) {
		int a = 3, b = 5;
		
		int result = (a > b) ? a-b : b-a;
		
		System.out.println("두 수의 차 : " + result);
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int result2 = (c > d) ? c-d : d-c;
		System.out.println("두 수의 차 : " + result2);
		
		sc.close();
	}
}
