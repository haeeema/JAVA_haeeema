package Day19.Ex01_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Hello");
		list.add(new Integer(178));
		list.add(new MyStudent());
		list.add(new Float(4.56F));
		list.add("Hello");
		list.add(new Integer(178));
		
		// Error (cannot convert from Object to String)
//		String name = list.get(0);
		
		String name = (String) list.get(0);
		Integer i1 = (Integer) list.get(1);
		MyStudent s = (MyStudent) list.get(2);
		
		System.out.println("name : " + name);
		System.out.println("i1 : " + i1);
		System.out.println("s : " + s);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}

}
