package Recap.Overriding;

class SuperClass {
	public Object method() {
		System.out.println("SuperClass");
		return new Object();
	}
}

class SubClass extends SuperClass {
	public String method() {
		System.out.println("SubClass");
		return "Hello, World";
	}
}

public class ReturnType {
	public static void main(String[] args) {
		SuperClass obj1 = new SuperClass();
		obj1.method();
		
		SubClass obj2 = new SubClass();
		obj2.method();
	}
}
