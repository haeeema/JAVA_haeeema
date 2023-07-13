package Day02;

public class Ex17_For {
	public static void main(String[] args) {
		// for(1초기식, 2조건식; 4증감식) {3실행문}
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i =50; i <= 100; i++) {
			System.out.print(i + " ");			
		}
		System.out.println();
		
		for (int i =1; i <= 20; i++) {
			if (i % 2 == 0) 
				System.out.print(i + " ");
		}
		System.out.println();	
		
		for (int i =1; i <= 40; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");			
		}
		System.out.println();
	}
}
