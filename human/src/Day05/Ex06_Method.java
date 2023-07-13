package Day05;

import java.util.Scanner;

public class Ex06_Method {
	
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static int minus(int a, int b) {
		int result = a - b;
		// return result;
		// 1. result를 메소드를 호출한 자리로 반환
		// 2. 메소드 종료
		// 3. 메모리 해제
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 메소드 호출 : 메소드면(인자1, 인자2)
		System.out.println( plus(a, b) );
		System.out.println( minus(a, b) );
		
		sc.close();
	}
}
