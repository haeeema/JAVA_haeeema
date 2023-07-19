package Day11.arrayex;

public class ArraySumAvg {
	public static void main(String[] args) {
		int arr[] = {1, 2, 9, 12, 15};
		
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}		
		avg = (double) sum / arr.length;
		
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avg);
		
		int arr2[] = new int[10];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}	
}
