package Day19.Ex01_List;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Hong");
		// add == addElement
		v.addElement("Lee");
		v.addElement(new Integer(123));
		v.addElement("Hong");
		v.addElement(new Integer(123));
		v.addElement(new MyStudent());
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println(v);
	}
}
