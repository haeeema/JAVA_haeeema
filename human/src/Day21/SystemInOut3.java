package Day21;

import java.io.InputStream;
import java.io.PrintStream;

public class SystemInOut3 {
	public static void main(String[] args) throws Exception {
		InputStream inputStream = System.in;
		PrintStream printStream = System.out;
		// 콘솔로 무자열을 출력하기 위해서 PrintStream 객체를 얻는다.
		
		byte[] datas = new byte[100];
		
		System.out.println("Name : ");
		int nameLength = inputStream.read(datas);
		
		String name = new String(datas, 0, nameLength - 2);
		// Enter값이 두칸 들어가 있기 때문에 2개를 뺀다.
				
		System.out.println("Comment : ");
		int commLength = inputStream.read(datas);
		
		String comment = new String(datas, 0, commLength - 2);
		
		System.out.println("commLen : " + commLength);
		System.out.println("datas : " + datas);
		System.out.println();
		
		printStream.println("Input name : " + name);
		printStream.println("Input comment : " + comment);
	}
}
