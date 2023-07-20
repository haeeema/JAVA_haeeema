package Recap;

public class StringDemo {
	public static void main(String[] args) {
		String palindrome = "Dot saw I was Tod";
		
		// String Length
		int len = palindrome.length();
		
		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];
		
		// Put original string in an array of chars
		for (int i = 0; i < len; i++) {
			tempCharArray[i] = palindrome.charAt(i);
		}
		
		for (int i = 0; i < len; i++) {
			System.out.println(tempCharArray[i]);
		}
		
		// Reverse array of chars
		for (int i = 0; i < len; i++) {
			charArray[i] = tempCharArray[len -1 -i];
		}
		
		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
	}
}
