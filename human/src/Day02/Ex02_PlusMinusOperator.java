package Day02;

public class Ex02_PlusMinusOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		//전위 연산자 potential operator
		c = ++a + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int x = 10;
		int y = 20;
		int z;
		
		//후위 연산자 backward operator
		z = x++ + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
	}
}
