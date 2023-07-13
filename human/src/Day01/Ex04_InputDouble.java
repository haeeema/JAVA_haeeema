package Day01;

import java.util.Scanner;

public class Ex04_InputDouble {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = sc.nextInt();
		
		System.out.print("y: ");
		int y = sc.nextInt();
		
		System.out.print("z: ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		int sum2 = x + y;
		int avg = sum / 3;
		
		System.out.println("총합계 : " + sum);
		System.out.println("두개합계 : " + sum2);
		System.out.println("평균 : " + avg);
		
		sc.close();
	}

}
