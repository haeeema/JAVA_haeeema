package Day12;

import java.util.Scanner;

public class MethodEx {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("국어 : ");
		int kor = intValue();
		System.out.println("수학 : ");
		int math = intValue();
		scorePrint(kor, math);
		sum(kor, math);
	}
	
	public static void inputScore() {
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		scorePrint(kor, math);
		// parameter로 전달
	}
	
	public static void scorePrint(int kor, int math) {
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
	}
	
	// 입력 객체 sc가 중복이 발생하기 때문에 입력 메소드를 작성한다.
	public static int intValue() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void sum(int kor, int math) {
		int sum = kor + math;
		System.out.println("합계 : " + sum);
		
	}
}
