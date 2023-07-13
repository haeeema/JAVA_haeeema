package Day05;

public class Ex03_Language {
	
	public static void main(String[] args) {
		
		int count[] = new int[6];
		
		for (int i = 0; i < count.length; i++) {
			count[i] = i+1;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print( count[i] + " ");
		}
		System.out.println();
		for (int num : count) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		String language[] = {"java", "html", "css", "javascript", "sql", "phyton"};
		
		for (int i = 0; i < language.length; i++) {
			System.out.print( language[i] + " ");
		}
		System.out.println( );
		
		for (String lang : language) {
			System.out.print(lang + " ");
		}
		System.out.println();
	}
}
