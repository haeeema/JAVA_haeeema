package Day19.Ex02_Map;

import java.util.Hashtable;
import java.util.Map;

/**
 * key와 value값이 null을 허용하지 않는다.
 * 
 * **/


public class HashTableTest {
	public static void main(String[] args) {
		Map map = new Hashtable();
		
		map.put(1, new Integer(100));
		map.put("second", "Hello World!!");
		map.put("third", new MyStudent());
//		map.put("fourth", null);
		// value에 null을 허용하지 않는다.
		
//		Integer i = map.get(1);
		Integer i = (Integer) map.get(1);
		
//		String str = map.get("second");
		String str = (String) map.get("second");
		
		System.out.println(i);
		System.out.println(str);
		MyStudent st = (MyStudent) map.get("third");
		System.out.println(st);
		
		System.out.println(map.get("third"));
		System.out.println(map.get("fourth"));
	}
}
