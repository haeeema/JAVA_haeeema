package Day05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02_NumberOfCurrency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat formatter = new DecimalFormat("###,###.##");		
//		int fiftyThousand = input / 50000;
//		int tenThousand = ( input % 50000 ) / 10000;
//		
//		int fiveThousand = (( input % 50000 ) % 10000 ) / 5000;
//		int oneThousand = ((( input % 50000 ) % 10000 ) % 5000) / 1000;
//		
//		int fiveHundred = (((( input % 50000 ) % 10000 ) % 5000) % 1000) / 500;
//		int oneHundred = ((((( input % 50000 ) % 10000 ) % 5000) % 1000) % 500) / 100;
//		
//		int fifty = (((((( input % 50000 ) % 10000 ) % 5000) % 1000) % 500) % 100) / 50;
//		int ten = ((((((( input % 50000 ) % 10000 ) % 5000) % 1000) % 500) % 100) % 50) / 10;
//		
//		int five = (((((((( input % 50000 ) % 10000 ) % 5000) % 1000) % 500) % 100) % 50) % 10) / 5;
//		int one = (((((((( input % 50000 ) % 10000 ) % 5000) % 1000) % 500) % 100) % 50) % 10) % 5;
//		
//		System.out.println("금액 : " + input);
//		System.out.println("50000 : " + fiftyThousand + "개" );
//		System.out.println("10000 : " + tenThousand + "개" );
//		System.out.println("5000 : " + fiveThousand + "개" );
//		System.out.println("1000 : " + oneThousand + "개" );
//		System.out.println("500 : " + fiveHundred + "개" );
//		System.out.println("100 : " + oneHundred + "개" );
//		System.out.println("50 : " + fifty + "개" );
//		System.out.println("10 : " + ten + "개" );
//		System.out.println("5 : " + five + "개" );
//		System.out.println("1 : " + one + "개" );
		int input = sc.nextInt();
		int currency = 50000;
		int number;
		
		System.out.println("금액 : " + formatter.format(input) + "원");
		
		number = input / currency;
		input = input % currency;
		System.out.println(formatter.format(currency) + "원 권 : " + number + "개");
		
		for (int i = 0; i < 9; i++) {
			if ( i%2 == 0 ) {
				currency = currency / 5;
			} else {
				currency = currency / 2;
			}
			number = input / currency;
			input = input % currency;
			System.out.println(formatter.format(currency) + "원 권 : " + number + "개");
		}
		sc.close();
	}
}
