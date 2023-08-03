package Day21;

import java.io.InputStream;

public class SystemInOut2 {
	public static void main(String[] args) throws Exception {
		System.out.println("===== menu =====");
		System.out.println("1. shirt");
		System.out.println("2. outer");
		System.out.println("3. trouers");
		System.out.println("4. suit");
		System.out.println("Choice the menu");
		
		InputStream is = System.in;
		// 입력값을 객체로 바꾸는 과정
		
		char inChar = (char) is.read();
		switch (inChar) {
		case '1' :
			System.out.println("You choose the shirt");
			break;
		case '2' :
			System.out.println("You choose the outer");
			break;
		case '3' :
			System.out.println("You choose the trouers");
			break;
		case '4' :
			System.out.println("You choose the suit");
			break;
		}
	}
}
