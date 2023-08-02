package Day19.Ex03_Generics;

import java.util.ArrayList;

public class BoxingTest {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		
		Integer data0 = new Integer(123);
		list.add(data0);
		Integer data1 = (Integer) list.get(0);
		int num = data1.intValue();
		System.out.println("value : " + num);
		
		int data2 = 543;
		list.add(data2); // Auto boxing
		int data3 = (Integer) list.get(1); // Unauto boxing
		System.out.println("value : " + data3);
	}
}
