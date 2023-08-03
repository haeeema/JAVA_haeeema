package Day21;

import java.io.InputStream;
import java.io.OutputStream;

public class SystemInOut {
	public static void main(String[] args) {
		try {
			InputStream is = System.in;
			// 콘솔에서 하나의 문자를 입력받는다.
			// 바로 입력기랑 연결한다.
			
			OutputStream os = System.out;
			// 콘솔로 하나의 문자를 출력한다.
			
			char asciiCode = (char) is.read();
			// read()는 정수형으로 값을 가져오기 때문에 char로 형변환을 해준다. 
			// 입력 스트림에서 byte 데이터를 읽어온다.
			
			os.write(asciiCode);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
