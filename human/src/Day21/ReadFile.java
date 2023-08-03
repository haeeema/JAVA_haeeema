package Day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("d:\\temp\\write.txt");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			while ((s = in.readLine()) != null) {
			// Buffer를 사용해서 readLine이 차이난다.
				System.out.println("read : " + s);
			}
			
			// 하나로 합칠 수 있다.
//			s = in.readLine( );
//			while ( s != null) {
//				System.out.println("read: " + s);
//				s = in.readLine( );
//			}
			
			in.close();
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
