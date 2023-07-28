package Day17.Ex01_Exception;

public class ArrayUtil {
	public void call() throws Exception {
		System.out.println("Call method start");
		
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3; // Exception
		
		System.out.println("Call method finish");
	}
}
