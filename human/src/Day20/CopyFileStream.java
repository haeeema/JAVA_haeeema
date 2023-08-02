package Day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("d:\\temp\\input.ini");
			out = new FileOutputStream(":d\\temp\\output.txt");
			
			int c = 0;
			while((c = in.read()) != -1)
				out.write(c);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
