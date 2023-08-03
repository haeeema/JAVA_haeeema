package Day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0, end =0;
		
		try {
			fis = new FileInputStream("d:\\temp\\sample.jpg");
			fos = new FileOutputStream("d:\\temp\\sample_copy2.jpg");
			
			start = System.currentTimeMillis();
			
			try {
				while((data = fis.read()) != -1) {
					fos.write(data);
				}
				
				fos.flush();
				fis.close();
				fos.close();
				end = System.currentTimeMillis();
				System.out.println("with out a BUFFER : " + (end - start) + "ms");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			fis = new FileInputStream("d:\\temp\\sample.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("d:\\temp\\sample_copy3.jpg");
			bos = new BufferedOutputStream(fos);
			
			start = System.currentTimeMillis();
			
			try {
				while((data = bis.read()) != -1) {
					bos.write(data);
				}
				
				bos.flush();
				bis.close();
				bos.close();
				end = System.currentTimeMillis();
				System.out.println("using a BUFFER : " + (end - start) + "ms");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
