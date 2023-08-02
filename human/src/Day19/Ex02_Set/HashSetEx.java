package Day19.Ex02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("servlet");
		set.add("spring");
		
		// Iterator search
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		System.out.println();
		
		// You must use Upper case and Lower case letters distinctly.
		set.remove("jdbc");
		System.out.println("number : " + set.size());
		System.out.println();
		
		it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty())
			System.out.println("is empty");
	}
}
