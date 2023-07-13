package Day03;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			if ( min > arr[i] ) {
				min = arr[i];
			}
		}
		
		System.out.print(min);
		sc.close();
	}
}
