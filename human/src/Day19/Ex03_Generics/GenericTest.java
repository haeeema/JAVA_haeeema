package Day19.Ex03_Generics;

public class GenericTest {
	public static void main(String[] args) {
		GOrigin<String> t = new GOrigin<String>();
		String str = "Hello";
		t.set(str);
		t.getData();
		
		GOrigin<Integer> t1 = new GOrigin<Integer>();
		int num = 1123;
		t1.set(num);
//		t1.set(str);
		t1.getData();
		
		GOrigin t3 = new GOrigin();
		// == GOrigin<Object> t3 = new GOrigin<Object>();
		// generics의 object는 왜 있는것인가??
		t3.set(str);
		t3.getData();
		t3.set(num);
		t3.getData();
	}
}
