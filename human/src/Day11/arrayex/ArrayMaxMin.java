package Day11.arrayex;

import java.util.Scanner;

public class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.println("값 입력 : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if ( min > arr[i] )
				min = arr[i];
			if ( max < arr[i] )
				max = arr[i];
		}
		
		System.out.println("Maximum Value : " + max);
		System.out.println("Minimum Value : " + min);
		
		sc.close();
	}
}
