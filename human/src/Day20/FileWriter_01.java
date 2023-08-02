package Day20;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriter_01 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
//		Scanner sc = new Scanner(System.in);
		
		FileWriter fout = null;
		int c = 0;
		try {
			fout = new FileWriter("d:\\temp\\test.txt");
			while ((c = in.read()) != -1)
				fout.write(c);
			in.close();
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
