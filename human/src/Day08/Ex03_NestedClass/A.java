package Day08.Ex03_NestedClass;

/**
 * nested class 
*/

// outer class
public class A {
	
	int a, b = 10;
	
	// inner class
	class B {
		int a, b = 20;
		
		public void bMethod() {
			System.out.println("이너 크래스에서 아우터 클래스의 멤버에 접근 가능");
			System.out.println("A의 a : " + a);
			System.out.println("A의 b : " + b);
		}
	}
	
	public void aMethod() {
		System.out.println("아우터 클래스에서 이너 클래스의 멤버에 접근 불가");
//		System.out.println("B의 x : " + x);
//		System.out.println("B의 y : " + y);
		System.out.println(a);
		System.out.println(b);
	}
}
