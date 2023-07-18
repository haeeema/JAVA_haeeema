package Day10;

import java.util.Scanner;

public class MemberMainTeacher {
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체출력\n6.종료");
		System.out.println("메뉴 선택");
	}
	// 특정변수가 전역변수로 사용할때 static
	// 속성을 사용하지 않는 메소드를 쓸때 static
	
	
	public static void main(String[] args) {

		int sel = 0;
		while(true) {
		
			showMenu();
			sel = sc.nextInt();
			
			switch(sel) {
			case 1: 
				MemberService.inputData();
				break;
			case 2:
				System.out.println("프로그램 종료함");
				System.exit(0);
			}
		}
	}
}