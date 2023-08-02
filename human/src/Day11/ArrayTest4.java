package Day11;

public class ArrayTest4 {
	public static void main(String[] args) {
		int num[];
		int total = 0;
		num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		
		System.out.println("Sum : " + total);
		
		total = 0;
		
		for (int i = 0; i < num.length; i++) {
			if( i%2 == 1)
				total += num[i];
		}
		
		System.out.println("Sum of even : " + total);
	}
}