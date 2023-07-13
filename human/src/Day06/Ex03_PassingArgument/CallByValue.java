package Day06.Ex03_PassingArgument;

public class CallByValue {
	
	public static int sum(int a, int b) {
		a = 100;
		b = 200;
		
		System.out.println("*****sum method*****");
		System.out.println("(a, b) : " + a + ", " + b);

		return a + b;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
				
		System.out.println("*****main method*****");
		System.out.println("(a, b) : " + a + ", " + b);
		System.out.println();
		
		int result = sum(a, b);
		System.out.println("result : " + result);
		System.out.println();
		// The a and b in the sum method.
		
		System.out.println("*****main method (after the 'sum' call)*****");
		System.out.println("(a, b) : " + a + ", " + b);
		System.out.println();
	}	
}
