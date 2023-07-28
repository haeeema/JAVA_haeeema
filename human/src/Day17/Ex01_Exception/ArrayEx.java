package Day17.Ex01_Exception;

public class ArrayEx {
	public static void main(String[] args) {
		int[] num = new int[2];
		try {
			num[0] = 100;
			num[1] = 200;
//			num[2] = 300;
			num[1] = 100 / 0;
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("Exception" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("오류 발생 유무와 무관하게 반드시 수행된다.");
		}
		System.out.println("Program off");
	}
}
