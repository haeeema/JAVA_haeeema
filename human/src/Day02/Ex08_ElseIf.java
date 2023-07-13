package Day02;

import java.util.Scanner;

public class Ex08_ElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("score : ");
		int score = sc.nextInt();
		String result = "";
		
		if (score >= 90)
			result = "A";
		else if (score >= 80)
			result = "B";
		else if (score >= 70)
			result = "C";
		else if (score >= 60)
			result = "D";
		else
			result = "F";
		
		System.out.println("The score is " + result);
		sc.close();
		
	}

}
