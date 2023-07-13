package Day02;

import java.util.Scanner;

public class Ex11_Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Grade : ");
		
		//sc.next() string
		//toUpperCase() uppercase
		//charAt(0) 문자열에서 해당 index(순서번호)의 문자를 추출

		//"A"-> "A"
		//"ABC" -> "A" 
		char grade = sc.next().toUpperCase().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.print("90~100");
			break;
		case 'B':
			System.out.print("80~90");
			break;
		case 'C':
			System.out.print("70~80");
			break;
		case 'D':
			System.out.print("60~70");
			break;
		case 'F':
			System.out.print("~60");
			break;
		default:
			System.out.print("err");
			break;
		}
		sc.close();
	}
}
