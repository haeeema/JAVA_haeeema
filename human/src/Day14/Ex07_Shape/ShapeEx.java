package Day14.Ex07_Shape;

public class ShapeEx {
	public static void main(String[] args) {		
		
		int width = 100;
		int height = 100;
		
		Rectangle rec = new Rectangle();
		rec.calcArea(width, height);
		rec.printArea();
		
		Triangle tri = new Triangle();
		tri.calcArea(width, height);
		tri.printArea();
	}
}
