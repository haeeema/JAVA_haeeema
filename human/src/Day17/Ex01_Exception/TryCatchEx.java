package Day17.Ex01_Exception;

import java.util.Scanner;

public class TryCatchEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		try {
			System.out.print("Number : ");
			num = sc.nextInt();			
		} catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} 
		
		System.out.println(num);
		System.out.println("Program off");
		
		sc.close();
	}
}
