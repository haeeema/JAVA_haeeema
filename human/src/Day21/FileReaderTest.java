package Day21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		File file = new File("write.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			int readChar;
			while((readChar = fr.read()) != -1) {
			// 비어있지 않으면 계속해서 실행
				System.out.println((char) readChar);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(fr != null)
				// 파일이 아직 사용되고 있다면 닫아라
					fr.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
