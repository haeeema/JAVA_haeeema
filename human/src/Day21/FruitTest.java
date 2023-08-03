package Day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest {
	static HashMap<String, Number> map;
	
	public static void main(String[] args) {
		String fruitName = null;
		int value = 0;
		
		File file = new File("fruitData.txt");
		
		try {
			map = new HashMap<String, Number>();
			
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			
			System.out.println("Information of the fruit");
			System.out.println("========================");
			
			while (s != null) {
				System.out.println(s);
				calcFruit(s);
				s = in.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void calcFruit(String s) {
		String fruitName = null;
		int value = 0;
		boolean isExisted = false;
		
		StringTokenizer st = new StringTokenizer(s, ",");
		
		while (st.hasMoreTokens()) {
			Set set = map.keySet();
			Iterator ite = set.iterator();
			fruitName = st.nextToken();
			
			while(ite.hasNext()) {
				String name = (String) ite.next();
				if (fruitName.equals(name)) {
					value = (Integer) map.get(name);
					map.put(name, ++value);
					isExisted = true;
					break;
				}
			}
			
			if (isExisted == false) {
				map.put(fruitName, ++value);
			}
			value = 0;
			isExisted = false;
		}
	}
}
