package Day14.Ex07_Shape;

public class Shape {
	protected float area;
	
	public void calcArea (float width, float height) {
		this.area = width * height;
	}
	
	public void printArea() {
		System.out.println("도형의 넓이는 " + this.area + "입니다.");
	}
	
}
