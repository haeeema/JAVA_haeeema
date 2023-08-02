package Day19.Ex01_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servelt");
		
		int size = list.size();
		System.out.println("length : " + size);
		System.out.println();
		
		String web = list.get(2);
		System.out.println("3th list : " + web);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		list.remove(1);
		System.out.println("remove=====================");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
