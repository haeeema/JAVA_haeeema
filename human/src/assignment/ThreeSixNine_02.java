package assignment;

public class ThreeSixNine_02 {
	
//	quot 0, 3, number ──┬── remain 0
//	                    ├── remain 3
//                      └── remain number
	
	public static void main(String[] args) {
		int quot;
		int remain;
		
		for (int i = 1; i <= 100 ; i++) {
			quot = i / 10;
			remain = i % 10;
			if (quot == 0) {
				if (remain % 3 == 0) System.out.println("*");
				else System.out.println(i);
			}	
			else if (quot % 3 == 0) {
				if (remain == 0) System.out.println("*");
				else if(remain % 3 == 0) System.out.println("**");
				else System.out.println("*");
				}
			else {
				if (remain == 0) System.out.println(i);
				else if (remain % 3 == 0) System.out.println("*");
				else System.out.println(i);
			}
		}
	}
}
