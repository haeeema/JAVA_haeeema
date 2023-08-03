package Day21;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File(".", "FileTest.java");
		// "." 현재 디렉토리를 뜻한다.
		System.out.println("파일의 경로는? " + file.getPath());
		System.out.println("파일의 이름은? " + file.getName());
		System.out.println("파일의 상위 디렉토리는? " + file.getParent());
		System.out.println("파일의 절대 경로는? " + file.getAbsolutePath());
		System.out.println("파일이 절대 경로인가? " + file.isAbsolute());
		System.out.println("파일이 존자하나? " + file.exists());
		System.out.println("파일인가? " + file.isFile());
		System.out.println("디렉토리인가? " + file.isDirectory());
		System.out.println("파일을 읽을 수 있나? " + file.canRead());
		System.out.println("파일을 쓸 수 있나? " + file.canWrite());
		System.out.println("파일의 바이트 크기는? " + file.length());
		
		boolean b = new File("." + File.separator + "hello").mkdir();
//		boolean b = new File("./hello").mkdir();
//		boolean b = new File(".\\hello").mkdir();
		System.out.println("+++++++++++++" + b);
		
		
		String[] listing = new File(".").list();
		System.out.println("현재 디렉토리 내용은?");
		for (int i = 0; i < listing.length; i++) {
			System.out.println(listing[i]);
		}
		
	}
}
