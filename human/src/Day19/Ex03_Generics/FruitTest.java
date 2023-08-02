package Day19.Ex03_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FruitTest {	
	public static void main(String[] args) {
		String[] fruit = { "사과", "바나나", "귤", "수박", "사과", "사과", "귤", "수박", "수박", "바나나", "귤", "사과", "사과", "수박", "귤", "바나나",
				"바나나", "사과", "귤", "귤" };
		boolean isExisted = false;
		String fruitName = null; // The name of the fruit
		int value = 0; // The number of the fruit
		
		HashMap<String, Number> map = new HashMap<String, Number>();
		
		for (int i = 0; i < fruit.length; i++) {
			fruitName = fruit[i]; // fruitName "사과", "바나나", "귤", "수박"
			Set set = map.keySet(); // HashMap의 모든 키를 가지고 온다.
			
			// Iterator form 27p
			Iterator ite = set.iterator();
			while(ite.hasNext()) {  // ite.hasNext()
				String name = (String) ite.next();  // ite.next()
				if(fruitName.equals(name)) {
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
		System.out.println("Print the number of the fruit");
		System.out.println("=============================");
		
		Set set = map.keySet();
		Iterator ite = set.iterator();
		
		while(ite.hasNext()) {
			fruitName = (String) ite.next();
			value = (Integer) map.get(fruitName);
			System.out.println(fruitName + ":" + value);
		}
	}
}
