package Day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerStream {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter out = null;
		Double sum = 0.;
		try {
			out = new PrintWriter(new FileWriter("d:\\temp\\scanner.txt"));
			out.write("9.7");
			out.write("123.456");
			out.flush();
			
			sc = new Scanner(new BufferedReader(new FileReader("d:\\temp\\scanner.txt")));
			while(sc.hasNext()) {
				if (sc.hasNextDouble())
					sum += sc.nextDouble();
				else
					sc.next();
			}
			
			System.out.println("Sum : " + sum);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
				if(sc != null)
					sc.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
