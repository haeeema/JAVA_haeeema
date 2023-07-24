package Day14.Ex07_Shape;

public class Triangle extends Shape {
	public Triangle() {
		System.out.println("Triangle constructor");
	}

	@Override
	public void calcArea (float width, float height) {
		super.area = width * height / 2.0f;
	}
}
