package Day19.Ex04_Exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
//			num[2] = 3;  	// ArrayIndexOutOfBoundsException
			num[1] = 3 / 0; // ArithmeticException
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} finally {
			System.out.println("오류 발생 유무와 무관하게 반드시 수행된다.");
		}
		System.out.println("World");
	}
}
