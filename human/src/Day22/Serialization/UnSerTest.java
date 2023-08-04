package Day22.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class UnSerTest {
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:\\temp\\serial.ser")));
			ArrayList list = (ArrayList) ois.readObject();
			
			System.out.println("Employee list : \n");

			Iterator ite = list.iterator();
			while(ite.hasNext()) {
				Employee p = (Employee) ite.next();
				System.out.println("Name : " + p.getName());
				System.out.println("Code : " + p.getJumin());
				System.out.println("Address : " + p.getAddr());
				System.out.println("Phone : " + p.getPhone());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
