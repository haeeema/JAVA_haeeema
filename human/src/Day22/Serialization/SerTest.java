package Day22.Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerTest {
	public static void main(String[] args) {
		Employee p = new Employee("Park", "Korea", "11111-222222", "123-4567");
		Employee p2 = new Employee("Kevin", "USA", "33333-444444", "987-6543");
		
		ArrayList list = new ArrayList();
		list.add(p);
		list.add(p2);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\temp\\serial.ser")));
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
