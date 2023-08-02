package Day19.Ex02_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("first", new Integer(100));
		map.put("second", "Hello World!!");
		map.put("third", new MyStudent());
		map.put("fourth", null);
		
		Set set = map.keySet();
		// 모든 키를 가지고 온다.
		Collection col = map.values();
		// 모든 값을 가지고 온다.
		
		Object[] obj = set.toArray();
		System.out.println("Print the keys");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		System.out.println();
		
		System.out.println("Retrieve the values using the keys.");
		for (int i = 0; i < obj.length; i++) {
			String key = (String) obj[i];
			System.out.println(map.get(key));
		}
		System.out.println();
		
		System.out.println("Print the values.");
		obj = col.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	}
}
