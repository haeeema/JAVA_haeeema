package Day17.Ex01_Exception;

public class divideEx {
	public static void main(String[] args) {

		int num2 = 0;
		
		try {
			int num1 = 100;
			
			num2 = num1 / 0;
			num2 = num1 * 100;
			
			System.out.println(num2);
		} catch (ArithmeticException e) {
			System.out.println("/ by zero");
		}
		System.out.println("Program off");
	}
}
