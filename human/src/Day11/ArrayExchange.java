package Day11;

/**
 * 배열의 순서를 반대로 나열하는 방법
 * **/
public class ArrayExchange {
	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int len = num.length;
		int temp[] = new int[len];
		
		System.out.println("교환 전 배열 내용");
		
		for (int i = 0; i < len; i++) {
			System.out.print( num[i] + "\t" );
			temp[i] = num[len-1-i];
		}
		System.out.println("\n");
		System.out.println("교환 전 배열 내용");
		for (int j = 0; j < temp.length; j++) {
			System.out.print( temp[j] + "\t" );			
		}
	}
}