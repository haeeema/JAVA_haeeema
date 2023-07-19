package Recap.Overriding;

public class Casting {
	public static void main(String[] args) {
		
		/**
		 *  Widening Casting
		**/
		int myInt = 9;
		double myDouble = myInt; 
		// Automatic casting from "Int" to "Double"
		
		System.out.println(myInt);
		// Output 9
		System.out.println(myDouble);
		// Output 9.0
		
		/**
		 *  Narrowing Casting
		**/
		double yourDouble = 9.79;
		int yourInt = (int) yourDouble;
		// Manual casting from "Double" to "Int"
		
		System.out.println(yourDouble);
		// Output 9.79
		System.out.println(yourInt);
		// Output 9
	}
}
