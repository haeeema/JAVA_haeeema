package Day20.Recap;

import java.io.InputStream;
import java.io.OutputStream;

public class SystemInOut {
	public static void main(String[] args) {
		try {
			InputStream is = System.in;
			// 콘솔에서 하나의 문자를 입력받는다.
			
			OutputStream os = System.out;
			// 콘솔로 하나의 문자를 출력한다.
			
			char asciiCode = (char) is.read();
			// 입력 스트림에서 byte 데이터를 읽어온다.
			
			os.write(asciiCode);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
