package Day06.Ex05_StaticMember;
// 1. 절대값
// 2. 최댓값
// 3. 최솟값
class Calculator {
	public static int abs(int val) {
		if (val<0)
			return -val;
		return val;
	
		//return val < 0 ? -val : val;
	}
	public static int max(int arr[]) {
//		int maxNumber = arr[0];
//		for (int i = 0; i < arr.length - 1 ; i++) {
//			if (arr[i] < arr[i + 1])
//				maxNumber = arr[i + 1];
//			else maxNumber = arr[i];
//		}
//		return maxNumber;
		
		//foreach
		int maxNumber = arr[0];
		for (int number : arr) {
			if (number > maxNumber)
				maxNumber = number;
		}
		return maxNumber;
		
	}
	public static int min(int arr[]) {
		int minNumber = arr[0];
		for (int i = 0; i < arr.length - 1 ; i++) {
			if (arr[i] > arr[i + 1])
				minNumber = arr[i + 1];
			else minNumber = arr[i];
		}
		return minNumber;
	}
}

public class StaticCalculator {
	public static void main(String[] args) {
		int arr[] = {70, 90, 85, 50, 100};
		
		// 다른 클래스의 static 메소드를 호출하는 방법
		// 클래스.메소드명() 형태로 메소드를 호출한다.
		System.out.println("abs(-123) : " + Calculator.abs(-123));
		System.out.println("max(arr) : " + Calculator.max(arr));
		System.out.println("mini(arr) : " + Calculator.min(arr));
	}
}
