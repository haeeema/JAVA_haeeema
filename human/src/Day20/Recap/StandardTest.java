package Day20.Recap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest {
	public static void main(String[] args) {
		String mesg = null;
		
//		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 버퍼는 "줄"단위, 엔터를 칠때까지
		
		System.out.println("Exit : Ctrl+Z");
		
		try {
			mesg = in.readLine();
			System.out.println(mesg);
			// 밖에서 한번 읽어야한다.
			while (mesg != null) {
			// 계속해서 입력을 받기 위한 while문
				System.out.println("read : " + mesg);
				mesg = in.readLine();
			}
			in.close();
//			ir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
