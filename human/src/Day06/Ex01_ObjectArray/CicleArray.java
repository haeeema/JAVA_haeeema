package Day06.Ex01_ObjectArray;

/*
	반지름이 1~5인 Circle 객체 5개를 가지는 배열을 생성하고,
	배열요소에 있는 모든 Circle 객체의 넓이를 출력하시오.
*/

class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CicleArray {
	
	public static void main(String[] args) {
		Circle c[] = new Circle[5];
		// Circle 객체 배열 c 선언
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle( i+1 );
		}
		
		// 출력
		for (Circle circle : c) {
			System.out.println("넓이 : " + circle.getArea());
		}
	}
}
