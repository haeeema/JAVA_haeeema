package Day19.Ex01_List;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		/** LinkedList class
		 * **/
		
		LinkedList<String> fruitList = new LinkedList<String>();
		
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Watermelon");
		fruitList.add(2, "Mango");
		
		int position = fruitList.indexOf("Watermelon");
		System.out.println("Position of Watermelon : " + position);
		
		fruitList.set(0, "Orange");
		String fruitName = fruitList.get(0);
		System.out.println("Name of fruit : " + fruitName);
		
		fruitList.remove(1);
		fruitList.remove("Watermelon");
		
		int size = fruitList.size();
		System.out.println("Print=============");
		
		for (int cnt = 0; cnt < size; cnt++) {
			fruitName = fruitList.get(cnt);
			System.out.println(fruitName);
		}	
	}
}
