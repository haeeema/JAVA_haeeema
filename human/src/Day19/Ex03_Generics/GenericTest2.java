package Day19.Ex03_Generics;

import java.util.ArrayList;

public class GenericTest2 {
	static class MyStudent {
		String name;
		
		public MyStudent(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<MyStudent> list = new ArrayList<MyStudent>();
		list.add(new MyStudent("Lee"));
		//list.add(new Integer(123));
		MyStudent s = list.get(0);	
	}
}
