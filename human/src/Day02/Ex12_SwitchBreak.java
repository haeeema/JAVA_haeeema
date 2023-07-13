package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		switch (num%5) {
		case 0:
			System.out.print("*");
			break;
		case 1:
			System.out.print("*");
			break;
		case 2:
			System.out.print("**");
			break;
		case 3:
			System.out.print("**");
			break;
		case 4:
			System.out.print("**");
			break;
		default:
			System.out.print("XX");			
			break;
		}
		sc.close();
	}
}