package Recap;

public class Calculator {
	public static int num1 = 5;

	public int num2 = 10;
	// static 없이 선언하였다.

	public static void Add(){
		System.out.println("Add()");
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(Calculator.num1);
		// 이미 메모리에 static변수가 할당되어 있어 인스턴스 생성없이 바로 사용/접근
		System.out.println(cal.num2);
		// static이 아닌경우 클래스 내부의 자원에 접근하려면 아래처럼 해당 클래스의 인스턴스를 생성하고 접근
		cal.Add();
		// static method내에서는 인스턴스 멤버들을 직접 사용 할 수 없다.
	}
}
