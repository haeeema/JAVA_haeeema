package Day21.Recap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest03 {
	static HashMap<String, Number> map = new HashMap<String, Number>();

	public static void main(String[] args) {
		String fruitName = null;
		int value = 0;

		File file = new File("d:\\temp\\fruitData.txt");

		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			System.out.println("과일 정보:");
			System.out.println("===================");
			while ((s = in.readLine()) != null) {
				System.out.println(s);
				System.out.println();
				calcFruit(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("과일 개수 출력하기");
		System.out.println("====================");
		Set set = map.keySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			fruitName = (String) ite.next();
			value = (Integer) map.get(fruitName);
			System.out.println(fruitName + ":" + value + "개");
		} // end while
	}

	private static void calcFruit(String s) {
		String fruitName = null;
		int value = 0;
		boolean isExisted = false;
		StringTokenizer st = new StringTokenizer(s, ",");
		while (st.hasMoreTokens()) {
			Set set = map.keySet();
			Iterator ite = set.iterator();
			fruitName = st.nextToken();
			while (ite.hasNext()) {
				String name = (String) ite.next();
				if (fruitName.equals(name)) {
					value = (Integer) map.get(name);
					map.put(name, ++value);
					isExisted = true;
					break;
				}
			}
			if (isExisted == false) {
				map.put(fruitName, ++value);
			}
			value = 0;
			isExisted = false;
		}
	}
}
