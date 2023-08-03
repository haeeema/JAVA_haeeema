package Day21.Recap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class FruitTest02 {
	static HashMap<String, Number> map;
	
	public static void main(String[] args) {
		File file = new File("d:\\temp\\fruitData.txt");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String strLine;
			
			while ((strLine = in.readLine()) != null) {
				System.out.println(strLine);
			}
			
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}
}
