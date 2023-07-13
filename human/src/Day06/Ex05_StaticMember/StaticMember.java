package Day06.Ex05_StaticMember;
/*
	static member : 메모리에 제일 먼저 할당
	instance member : 객체가 생성될 때 할당
*/
public class StaticMember {
	
	// static variable
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592;
	
	// static method
	public static int sum(int x, int y) {
		
		int sum = a + b + x + y;
		//int sum = a + b + c + x + y;
		// static 변수만 사용 가능, 시작할때 c는 메모리 공간에 없다.
		// static 메소드 내에서는 접근할 수 없다.
		
		// 왜 a + b + 30 이 아닌지???
		
		return sum;
	}

	@Override
	public String toString() {
		return "StaticMember [c=" + c + "]";
	}

	public static void main(String[] args) {
		
		int sum = sum(10, 20);  // a + b + 30
		System.out.println("sum : " + sum);
		System.out.println("인스턴스 생성 전 입력 전" + a);
		
		a = 100; // a = 100
		
		System.out.println("인스턴스 생성 전 입력 후" + a);
		//System.out.println(c);
		
		StaticMember sm1 = new StaticMember(); // a(100), b, c, PI
		StaticMember sm2 = new StaticMember(); // a(100), b, c, PI
		
		System.out.println("sm1 : " + sm1);
		System.out.println("sm1 : " + sm2);
		
		int a1 = sm1.a;			//100
		int c1 = sm1.c = 10;	//10
		int a2 = sm2.a;			//100
		int c2 = sm2.c = 20;	//20
		
		System.out.println("sm1 : " + sm1);
		System.out.println("sm1 : " + sm2);
		
		//PI = 100;
		// 상수는 final로 지정해서 바꿀 수 없다.
		
		System.out.println("a1 : " + a1);	//
		System.out.println("c1 : " + c1);	//
		System.out.println("a2 : " + a2);	//
		System.out.println("c2 : " + c2);	//
	}
		
}
