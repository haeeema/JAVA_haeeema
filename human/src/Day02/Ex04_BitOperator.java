package Day02;

public class Ex04_BitOperator {
	public static void main(String[] args) {
		int result = 20 & 16;
		System.out.println(result);
		
		//Integer.toBinaryString() : 십진수 숫자를 이진수 문자열로 변환하는 메소드
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		int result2 = 20 | 16;
		System.out.println(result2);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		int result3 = 20 ^ 16;
		System.out.println(result3);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		
		int result4 = ~20;
		//int 20 => 0000 0000 0000 0000 0000 0000 0001 0100
		//MAX SIGN BIT : 2진수 최고 자리 숫자가 부호비트
		System.out.println(result4);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println("------------------------");
		System.out.println(Integer.toBinaryString(result4));
		System.out.println();
		
		System.out.println("<< 연산하면 2배씩 증가");
		System.out.println(2 << 1); //왼쪽으로 비트 1칸 이동
		System.out.println(2 << 2); //왼쪽으로 비트 2칸 이동
		System.out.println(2 << 3);
		System.out.println();
		
		System.out.println(">> 연산하면 1/2배씩 증가");
		System.out.println(16 >> 1); //오른쪽으로 비트 1칸 이동
		System.out.println(16 >> 2); //오른쪽으로 비트 2칸 이동
		System.out.println(16 >> 3);
		System.out.println();
		
		System.out.println("부호가 있는 경우");
		System.out.println(-2 << 1); //왼쪽으로 비트 1칸 이동
		System.out.println(-2 << 2); //왼쪽으로 비트 2칸 이동
		System.out.println(-2 << 3);
		System.out.println();
		
		//논리 시프트
		System.out.println(2 >> 1);
		System.out.println(-2 >> 31);
		System.out.println(-2 >>> 31);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println();
		System.out.println();
		System.out.println();
		
		}
}
