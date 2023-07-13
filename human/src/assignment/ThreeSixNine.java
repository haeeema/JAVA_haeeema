package assignment;

public class ThreeSixNine {

	public static void main(String[] args) {
		int ten;
		int one;
		
		for (int i = 1; i <= 100; i++) {
			ten = i / 10;
			one = i % 10;
			if (i < 10) {
				if (i%3==0) 
					System.out.println("*");
				else System.out.println(i);
			} else {
				if (one==0) {
					if (ten%3==0) {
						System.out.println("*");
					} else {
						System.out.println(i);						
					}
				} else {
					if (ten%3==0) {
						if (one%3==0) {
							System.out.println("**");
						} else {
							System.out.println("*");
						}
					} else {
						if (one%3==0) {
							System.out.println("*");
						} else {
							System.out.println(i);
						}
					}
				}
			}
		}
	}
}