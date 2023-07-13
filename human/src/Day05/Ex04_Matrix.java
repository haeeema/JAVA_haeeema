package Day05;

import java.util.Scanner;

public class Ex04_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		System.out.println("row : " + row);
		int line = sc.nextInt();
		System.out.println("line : " + line);
		
		int arr[][] = new int[row][line];
		int number = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = number++;
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		// foreach를 이용한 출력
		for (int[] arrarr : arr) {
			for (int col : arrarr) {
				System.out.print(col + " ");
			}System.out.println();
		}
		for (int[] arrarr : arr) {
			System.out.println(arrarr + " ");
		}
		
		sc.close();
	}
}
