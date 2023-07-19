package Recap.Overriding;

public class Polymorphism {
	
	static class Human {
		
		public void printInfo() {
			System.out.println("I'm a human");
		}
	}
	
	static class Man extends Human {
		// Overriding
		public void printInfo() {
			super.printInfo();
			System.out.println("and I'm a man");
		}
		// Subclass only
		public void name() {
			System.out.println("My name is Kevin");
		}
	}
	static class Woman extends Human {
		public void printInfo() {
			super.printInfo();
			System.out.println("and I'm a woman");
		}
	}
	
	public static void main(String[] args) {
		/**
		Man man = new Man();
		Woman woman = new Woman();
		
		man.printInfo();
		woman.printInfo();
		**/
		// Polymorphism
		Human human = new Man();
		human.printInfo();
		// Casting
		((Man) human).name();
		System.out.println();
		human = new Woman();
		human.printInfo();
		
		if (human instanceof Man)
			System.out.println("I'm a really man");
		if (human instanceof Woman)
			System.out.println("I'm a really woman");
	
	}
}
