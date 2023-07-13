package Day06.Ex03_PassingArgument;

import Day04.Class.Pikachu;

public class CallByReference {
	
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		System.out.println("*****setArr method*****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println();
	}
	
	public static void setObj(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "fire";
		
		System.out.println("*****setObj method*****");
		System.out.println(pikachu);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "eletricity";
		
		for (int i = 0; i < arr.length; i++) {
			// 1 2 3 4 5
			arr[i] = i + 1;
		}
		
		System.out.println("*****main method*****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println(pikachu);
		System.out.println();
		
		setArr( arr );
		setObj( pikachu );
		
		System.out.println("****main method(after call)");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println();
		System.out.println(pikachu);
	}
}
