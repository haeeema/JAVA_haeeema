package Day02;

import java.util.Scanner;

public class Ex23_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력 : ");
			String str = sc.nextLine();
			
			//문자열.equels("비교문자열")
			//: 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
			if( str.equals("STOP"))
				break;
			
			System.out.print(">> " + str);
		}
		
		System.out.println("exit");
		sc.close();
	}
}
