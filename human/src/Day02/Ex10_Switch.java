package Day02;

import java.util.Scanner;

public class Ex10_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("channels : ");
		int channel = sc.nextInt();
		
		switch (channel) {
		case 1:
			System.out.println("SBS");
			break;
		case 2:
			System.out.println("MBC");
			break;
		case 3:
			System.out.println("KBS");
			break;
		case 13:
			System.out.println("EBS");
			break;
		case 33:
			System.out.println("tvN");
			break;
		default:
			System.out.println("없음");
			break;
		} 
		sc.close();
	}
}
