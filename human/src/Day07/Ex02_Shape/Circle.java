package Day07.Ex02_Shape;

public class Circle extends Shape {

	double radius;

	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	double area() {
		return radius * radius * Math.PI;
	}

	@Override
	double round() {
		return 2 * radius * Math.PI;
	}

}
