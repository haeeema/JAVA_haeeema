package Day05;

import java.util.Scanner;

public class Ex05_ChickenMenu {
	
	// 메뉴판을 메소드
	public static void printMenu() {
		System.out.println("########## 메 뉴 판 ##########");
		System.out.println("1. 교촌치킨 \t 허니콤보치킨");
		System.out.println("2. 처갓집 \t 양념치킨");
		System.out.println("3. 굿후렌드 \t 후라이드치킨");
		System.out.println("4. 후라이드잘하는집 \t 후라이드치킨");
		System.out.println("5. 보드람 \t 후라이드치킨");
		System.out.println("5. 굽네치킨 \t 볼케이노치킨");
		System.out.println("5. BBQ \t\t 황금올리브치킨");
		System.out.println("0. 종료");
		System.out.print("########## 입 력 : ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menu = 0;
		int count = 0;

		while(true) {
			printMenu();
			int input = sc.nextInt();
			
			if( input == 0) {
				System.out.println( count + "개의 주문을 완료합니다.");
				break;
			}
			else if ( input<=0 || input>=7) {
				System.out.println( "없는 메뉴입니다.");				
			}
			else {
				menu = input;
				count++;
				System.out.println( menu + "이 주문되었습니다.");
				System.out.println();
			}
		}
		sc.close();
	}
}
