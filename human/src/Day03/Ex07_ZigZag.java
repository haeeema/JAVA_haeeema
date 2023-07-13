package Day03;

import java.util.Scanner;

public class Ex07_ZigZag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[][] = new int[num][num];
		int a = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if ( i%2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = a++;
				}
			} else {
				for (int j = num-1; j >= 0; j--) {
					arr[i][j] = a++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
		sc.close();
	}
}
