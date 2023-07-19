package Recap.Overriding;

public class AccessModifiers {

	static class Parent {
		// Private methods are not overridden.
		private void m1() {
			System.out.println("From parent m1()");
			System.out.println();
		}

		protected void m2() {
			System.out.println("From parent m2()");
			System.out.println();
		}
	}

	static class Child extends Parent {
		// new m1() method
		// unique to Child class
		private void m1() {
			System.out.println("From child m1()");
			System.out.println();
		}

		// overriding method
		// with more accessibility
		public void m2() {
			System.out.println("From child m2()");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.m1();
		obj1.m2();
		Parent obj2 = new Child();
		obj2.m1();
		obj2.m2();
	}

}
