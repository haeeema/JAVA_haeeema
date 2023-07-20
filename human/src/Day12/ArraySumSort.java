package Day12;

import java.util.Scanner;

public class ArraySumSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int max = 0, avg = 0, sum = 0;
		
		System.out.println("개의 값을 입력해주세요.");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print( (i + 1) + "번째 값:");
			arr[i] = sc.nextInt();
			// 합
			sum += arr[i];
			// 최댓값
			if (max<arr[i])
				max = arr[i];
		}
		//평균
		avg = sum/arr.length;
		
		System.out.println("결과");
		System.out.println("합산 : " + sum + " / 평균 : " + avg + " / 최댓값 : " + max);
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("\n=============================================");
		
		// 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					
				}
			}
		}
		sc.close();
	}
}
