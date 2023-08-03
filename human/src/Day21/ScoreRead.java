package Day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

// 파일에서 시험 점수를 읽어서 총점과 평균을 구하는 예제
public class ScoreRead {
	public static void main(String[] args) {
		int totalScore = 0;
		int count = 0;
		float average = 0.0f;
		
		File file = new File("d:\\temp\\scoreData.txt");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			if (s != null) {
				System.out.println("Test score : " + s);
				StringTokenizer st = new StringTokenizer(s, ",");
				while(st.hasMoreTokens()) {
					totalScore += Integer.parseInt(st.nextToken());
					count++;
				}
				System.out.println("Total score : " + totalScore);
				System.out.println("Count : " + count);
				
				average = (float) totalScore / count;
				System.out.println("Average" + average);
			}
			in.close();
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
