package Day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {
	public static void main(String[] args) {
		FileReader in = null;
		int n = 0;
		
		try {
			in = new FileReader("c:\\windows\\system.ini");
			while((n = in.read()) != -1) {
			// read()는 정수형, 값이 아스키코드 값이다.	
				System.out.println((char) n);					
			}
			in.close();	
		} catch (FileNotFoundException e) {
			System.out.println("해당경로에 파일이 없음" + e.getMessage());
		} catch (IOException e) {
			System.out.println("파일 입력 오류" + e.getMessage());	
		}		
	}
}
