package Day11.arrayex;

public class ArrayTest01 {
	public static void main(String[] args) {
		int num[] = new int[2];
		
		// 초기값을 주기 너무 많을때
		int values[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(values[0]);
		
		char ch[] = new char[5];
		
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		ch[4] = 'e';
		
		num[0] = 100;
		num[1] = 200;
		num[1] = (int) 12.345F;
		// num[2] = 300; ArrayIndexOutofBoundsException
		
		System.out.println("num[0] = " + num[0]);
		System.out.println("num[1] = " + num[1]);
		
		int len = num.length;
		System.out.println("Array length" + len);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
