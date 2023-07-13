package Day01;

import java.util.Scanner;
//다중 import : ctrl + shift + o

public class Ex07_Circle {
	
	public static void main(String[] args) {
		
		final double PI = 3.141592;
		// 상수 선언 final
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이 : " + area);
		
		sc.close();
				
	}
}
