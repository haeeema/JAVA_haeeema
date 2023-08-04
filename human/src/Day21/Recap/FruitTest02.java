package Day21.Recap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest02 {	
	static HashMap<String, Number> map = new HashMap<String, Number>();
	
	public static void main(String[] args) {
		File file = new File("d:\\temp\\fruitData.txt");
		
		String kindOfFruit = "";
		int value = 0;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String string;
			
			System.out.println("Information of the fruit");
			System.out.println("========================");
			
			while ((string = in.readLine()) != null) {
				calcFruit(string);
			}
			
			Set set = map.keySet();
			Iterator ite = set.iterator();
			
			while(ite.hasNext()) {
				kindOfFruit = (String) ite.next();
				value = (Integer) map.get(kindOfFruit);
				System.out.println(kindOfFruit + ":" + value);
			}
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}
	
	private static void calcFruit(String string) {
		
		StringTokenizer st = new StringTokenizer(string, ",");
		// 분리시켜서 가진 리스트
		String kindOfFruit = "";
		int value = 0;
		boolean isExisted = false;
		
		// 종류를 만들어주는 while
		while (st.hasMoreTokens()) {
			
			Set set = map.keySet();
			Iterator ite = set.iterator();
			// set으로 키를 모아주고 iterator로 하나씩 값을 넣는다.
			
			while (ite.hasNext()) {
			// set list에서 하니씩 가져온다.
				String name = (String) ite.next();
				if (kindOfFruit.equals(name)) {
					value = (Integer) map.get(name);
					map.put(name, ++value);
					isExisted = true;
					break;
				}
			}
			
			if (isExisted == false) {
				map.put(kindOfFruit, ++value);
			}
			value = 0;
			isExisted = false;
		}
	}
}
	
