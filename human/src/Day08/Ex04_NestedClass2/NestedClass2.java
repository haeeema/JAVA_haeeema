package Day08.Ex04_NestedClass2;

public class NestedClass2 {
	public static void main(String[] args) {
		// X
		// -Y
		// -Z
		X x = new X();
		
		X.Y y = x.new Y();
		
		y.value1 = 10;
		System.out.println("X의 객체 변수 : " + y.value1);
		y.method1();
		
		X.Z z = new X.Z();
		
		z.value1 = 20;
		System.out.println("X의 Z의 객체 변수 : " + z.value1);
		
		X.Z.value2 = 30;
		System.out.println("X의 Z 객체 static 변수 : " + X.Z.value2);
		z.method1();
		X.Z.method2();
		
		x.method();
	}
}
