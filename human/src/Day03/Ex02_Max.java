package Day03;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		int max = 0;
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			if ( max < arr[i] ) {
				max = arr[i];
			}
		}
		System.out.print(max);
		sc.close();
	}
}
