package Day19.Ex04_Exception;

public class ThrowTest {
	public static void main(String[] args) {
		ArrayUtil t = new ArrayUtil();
		try {
			t.call();
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println("main method에서 예외 처리");
		}
		System.out.println("World");
	}
}
