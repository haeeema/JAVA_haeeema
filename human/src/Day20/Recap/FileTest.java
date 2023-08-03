package Day20.Recap;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File(".", "FileTest.java");
		System.out.println("파일의 경로는?" + file.getPath());
		
	}
}
