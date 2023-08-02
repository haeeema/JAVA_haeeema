package Day09;

public class MemberMain {
	
	public static void showMenu(){
		  System.out.println("1.회원입력");
		  System.out.println("2.회원조회");
		  System.out.println("3.회원삭제");
		  System.out.println("4.회원변경");
		  System.out.println("5전체출력");
		  System.out.println("6.종료");
		  System.out.print("메뉴 선택:");
	}
	public static void main(String[] args) {
		int sel=0;
		MemberService memberService = new MemberService();

		while(true) {
			showMenu();
			
			sel= InputScanner.sc.nextInt();
			switch(sel) {
			case 1:
				memberService.inputData();
				break;
			case 2:
				memberService.searchData();
				break;
			case 3:
				memberService.deleteData();
				break;
				case 6:
					System.out.println("프로그램을 종료함");
					System.exit(0);
			}
		}
	}
}
