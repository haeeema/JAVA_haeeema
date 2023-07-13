package Day02;

public class Ex19_GuguAll {
	//이중 반복문
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j =1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
	}
}
