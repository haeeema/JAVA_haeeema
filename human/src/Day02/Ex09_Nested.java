package Day02;

import java.util.Scanner;

public class Ex09_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.print("학년(1~4) : ");
		int year = sc.nextInt();
		
		if (year == 4) {
			if (score >=60 ) {
				System.out.print("합격");
			} else {
				System.out.print("불합격");				
			}
		} else {
			System.out.print("응시X");
		}
		
		
		
		
		sc.close();
		
		

	}

}
