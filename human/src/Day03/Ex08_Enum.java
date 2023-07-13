package Day03;

// enum(열거체) 정의
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

public class Ex08_Enum {
	public static void main(String[] args) {
		// 1. enum을 비교할 때에는 값뿐만 아니라 타입도 비교한다.
		// 2. enum의 상수값이 재정의 되도 다시 컴파일 할 필요가 없다.
		// 교재 171p
		
		// values() : 열거체의 모든 요소를 배열로 반환
//		Rainbow[] rainbow = new Rainbow[]
		
		Rainbow[] rainbow = Rainbow.values();
		
		//foreach
		for (Rainbow color : rainbow) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		// valueOf()
		Rainbow G = Rainbow.valueOf("GREEN");
		System.out.println("G : " + G);
		
		// ordinal()
		int index = G.ordinal();
		System.out.println("GREEN 의 index : " + index);
		}
}
