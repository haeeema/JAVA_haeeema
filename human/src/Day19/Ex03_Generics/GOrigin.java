package Day19.Ex03_Generics;

public class GOrigin<T> {
	T data;

	public void set(T n) {
		data = n;
	}
	
	public void getData() {
		System.out.println(data);
	}
}
