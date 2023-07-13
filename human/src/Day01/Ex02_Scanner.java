package Day01;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		//클래스타입 클래스명 = new 클래스명();
		Scanner sc = new Scanner(System.in);
		
		double b = 1 % 6;
		
		System.out.println("a : ");
		int a = sc.nextInt();
		
		System.out.println("a : " + a );
		System.out.println(b);
		sc.close();
	}
}
