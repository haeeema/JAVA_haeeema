package Day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ScoreWrite {
	public static void main(String[] args) {
		int count = 1;
		// 몇 번 입력했는지를 카운트 하는 변수
		
		String scoreData = "";
		String s = null;
		File file = new File("d:\\temp\\ScoreData.txt");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file, false));
			// false 면 추가적으로 받지 못한다.
			do {
				System.out.println("(" + count + ")" + "Write the scores.");
				s = in.readLine();
				
				if (isRealNumber(s)) {
					if (count != 10) {
						scoreData += s + ",";
					} else {
						scoreData += s;
					}
					count++;
				} else {
					System.out.println("Number only");
				}
			} while (count <= 10);
			
			out.println(scoreData);
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
		System.out.println("시험점수를 파일로 출력합니다.");
	}
	
	// 입력 받은 데이터가 숫자인지르 체크하는 메소드
	public static boolean isRealNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
