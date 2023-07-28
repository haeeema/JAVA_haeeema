package Day17.Ex01_Exception;

public class ThrowsEx {
	public static void main(String[] args) {
		ArrayUtil t = new ArrayUtil();
		try {
			System.out.println("Try1");
			t.call();			
			System.out.println("Try2");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("catch");
		}
		
		System.out.println("Hello");
	}
}
