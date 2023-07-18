package Day10;

import java.util.Scanner;

public class MemberMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void show() {
		System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체출력\n6.종료");
		System.out.print("입력 : ");
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int input = 0;

		do {
			show();
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("회원입력");
				System.out.println();
				break;
			case 2:
				System.out.println("회원조회");
				System.out.println();
				break;
			case 3:
				System.out.println("회원삭제");
				System.out.println();
				break;
			case 4:
				System.out.println("회원변경");
				System.out.println();
				break;
			case 5:
				System.out.println("전체출력");
				System.out.println();
				break;
			case 6:
				System.out.println("종료");
				System.out.println();
				break;
			default:
				System.out.println("1-6의 값 입력");
				System.out.println();
				break;
			}

		} while (input != 6);
//		sc.close();
	}
	
}
