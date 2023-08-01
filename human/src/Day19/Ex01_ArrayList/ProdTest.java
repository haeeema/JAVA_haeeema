package Day19.Ex01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ProdTest {
	public void getProdInfo(List list) {
		Product prod = null;
		String code = null;
		String name = null;
		String color = null;
		int qty = 0;
		
		for (int i = 0; i < list.size(); i++) {
			prod = (Product) list.get(i);
			code = prod.getCode();
			name = prod.getName();
			color = prod.getColor();
			qty = prod.getQty();
			
			System.out.println("Product code : " + code);
			System.out.println("Product name : " + name);
			System.out.println("Product color : " + color);
			System.out.println("Product quantity : " + qty);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// List
		ArrayList pList = new ArrayList();
		Product p1 = new Product();
		Product p2 = new Product("0002", "smartTV", "white", 200);
		Product p3 = new Product("0003", "laptop", "silver", 100);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		ProdTest p = new ProdTest();
		p.getProdInfo(pList);
	}
}
