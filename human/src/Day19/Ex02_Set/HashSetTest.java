package Day19.Ex02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Day19.Ex01_List.MyStudent;

public class HashSetTest {
	public static void main(String[] args) {
		Set<MyStudent> set = new HashSet<MyStudent>();
		
//		Set set = new HashSet();
//		set.add("Hello");
//		set.add(new Integer(100));		
//		set.add(300);
//		set.add(12.345F);
//		set.add(new MyStudent());
//		set.add(new MyStudent("java", 3));
//		Object[] obj = set.toArray();
//		
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(obj[i]);
//		}
		
		set.add(new MyStudent());
		set.add(new MyStudent("java", 3));
		
		Object[] obj = set.toArray();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(obj[i]);			
		}
		System.out.println(set);
	}
}
