package Day20.Recap;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class SystemInOut3 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		PrintStream ps = System.out;
		// 콘솔로 무자열을 출력하기 위해서 PrintStream 객체를 얻는다.
		
		byte[] datas = new byte[100];
		
		System.out.println("name : ");
		int nameLen = is.read(datas);
		String name = new String(datas, 0, nameLen - 2);
		
	}
}
