package Day04.Ex02_Calculator;

/**
 * 계산기
 */
public class Calculator {
	
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public int sum(int[] arr) {
		int sum = 0;
		
		for (int i : arr) {
			sum += i;
		}
		int result = sum;
		return result;
	}
	
	public double avg( int[] arr) {
		double result = (double) sum(arr) / arr.length;
		return result;
	}
	
}
