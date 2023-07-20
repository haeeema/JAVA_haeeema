package Day12;

import java.util.Scanner;

public class ArraySumSortMe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int sum = 0;
		int avg = 0;
		int max = Integer.MIN_VALUE;
		int temp = 0;
		
		System.out.println("10개의 값을 입력해주세요.");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + " 번째 값 : ");
			arr[i] = sc.nextInt();
		}
		
		// sum
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		// avg
		avg = sum/arr.length;
		
		// max
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i] )
				max = arr[i];
		}
		
		System.out.println("*************************************");
		System.out.println();
		System.out.println("Result");
		System.out.println("합산 : " + sum + " / 평균 : " + avg + " / 최댓값 : " + max);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n================================================================================");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		sc.close();
	}
}
