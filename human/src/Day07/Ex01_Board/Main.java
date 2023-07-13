package Day07.Ex01_Board;

import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static int max = 10;
	static Board[] boardList = new Board[max];
	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("########## 게시판 ##########");
		System.out.println("1. 게시판 목록");
		System.out.println("2. 게시판 읽기");
		System.out.println("3. 게시판 쓰기");
		System.out.println("4. 게시판 수정");
		System.out.println("5. 게시판 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("############ 빈공간 " + nullcount());
		System.out.println("############ 입력 : ");
	}
	
	public static void list() {
		System.out.println(" # 게시글 목록");
		for (Board board : boardList) {
			System.out.println(board);
		}
	}
	
	public static void read() {
		System.out.println("# 게시글 읽기");
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		if (check(boardNo)) {
			return;
		};
		
		Board board = boardList[boardNo-1];
		System.out.println(board);
		
		if(board == null) {
			System.out.println("게시글이 존재하지 않습니다.");
		} else {
			System.out.println(board);
		}
	}
	
	public static void write() {
		System.out.println("# 게시글 쓰기");
		
		Board board = input();
				
		int index = getIndex();
		
		//게시글 최대 개수 제한 확인
		if (index < max) {
			boardList[index] = board;
			boardList[index].setBoardNo(index+1);
			boardList[index].setRegDate(new Date());
			boardList[index].setUpdDate(new Date());
			System.out.println("# 게시글이 작성되었습니다.");
		}
		else {
			System.out.println("# 게시글 목록이 꽉 찼습니다.");
		}
	}
	
	public static int getIndex() {
		int index = max;
		
		for (int i = 0; i < boardList.length; i++) {
			if( boardList[i] == null) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void update() {
		System.out.print("수정할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		if (check(boardNo)) {
			return;
		};
		
		if( boardList[boardNo-1] == null) {
			System.out.println("게시글이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("# 글 수정");
		Board board = input();
		
		String updatedTitle = board.getTitle();
		String updatedWriter = board.getWriter();
		String updatedContent = board.getContent();
						
		boardList[boardNo-1].setTitle(updatedTitle);
		boardList[boardNo-1].setWriter(updatedWriter);
		boardList[boardNo-1].setContent(updatedContent);
		boardList[boardNo-1].setUpdDate(new Date());

		
		// boardList[boardNo - 1] = board;
	}
	
	public static void delete() {
		System.out.print("삭제할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		if (check(boardNo)) {
			return;
		};
		
		boardList[boardNo - 1] = null;
		System.out.println("게시글이 삭제되었습니다.");
	}
	
	// 빈공간 카운트
	public static int nullcount() {
		int count = 0;
		for (int i = 0; i <= 9 ; i++) {
			if (boardList[i] == null) {
				count++;
			}
		}
		return count;
	}
	
	// 글번호 유효성 검사
	public static boolean check(int boardNo) {
		if ( boardNo <= 0 || boardNo > max) {
			System.out.println("1~10번 까지만 입력가능합니다.");
			return true;
		}
		return false;
	}
	
	// 게시글 정보 입력
	public static Board input() {		
		System.out.print("제목 : ");
		String title = sc.nextLine();

		System.out.print("작성자 : ");
		String writer = sc.nextLine();

		System.out.print("내용 : ");
		String content = sc.nextLine();

		Board board = new Board(title, writer, content);
		
		return board;
	}
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		
		do {
			//메뉴판 출력
			menu();
			
			//메뉴번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			//메뉴번호 선택
			switch (menuNo) {
				case 1: list(); break;
				case 2: read(); break;
				case 3: write(); break;
				case 4: update(); break;
				case 5: delete(); break;
				default:break;
			}
		} while (menuNo !=0);
		System.out.println("게시판을 종료합니다...");
	}
}