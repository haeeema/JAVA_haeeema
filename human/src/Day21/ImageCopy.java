package Day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopy {
	public static void main(String[] args) {
		try {
			File file = new File("d:\\temp\\sample.jpg");
			InputStream in = new FileInputStream(file);
			OutputStream out = new FileOutputStream("d:\\temp\\sample_copy.jpg");

			System.out.println("파일 크기는 " + file.length());
			
			long begin = System.currentTimeMillis();
			
//			byte[] buffer = new byte[100];
			byte[] buffer = new byte[1024*8];
			
			while(true) {
				int count = in.read(buffer);
				if (count == -1)
					break;
					
				out.write(buffer, 0, count);
			}
			in.close();
			out.close();
			System.out.println("Coppied the image.");
			
			long end = System.currentTimeMillis();
			System.out.println("복사 시간은 : " + (end - begin) + "ms입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
