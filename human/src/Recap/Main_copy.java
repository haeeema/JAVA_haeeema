package Recap;

import java.util.Scanner;

public class Main_copy {
	
	static Scanner sc = new Scanner(System.in);
	static Board_copy[] boardList = new Board_copy[10];
	
	public static void list() {
		for (int i = 0; i < boardList.length; i++) {
			System.out.println(boardList[i]);					
		}
	}
	
	public static void read() {
		System.out.print("board number : ");
		int index = sc.nextInt();
		
		System.out.println(boardList[index]);
	}
	
	public static void write() {
		System.out.println("# 게시글 쓰기");
		
		System.out.print("title : ");
		String title = sc.nextLine();
		
		System.out.print("writer : ");
		String writer = sc.nextLine();
		
		System.out.print("content : ");
		String content = sc.nextLine();
		
		Board_copy board = new Board_copy(title, writer, content);
		
		int index = 0;
		for (int i = 1; i < boardList.length; i++) {
			if ( boardList[i] == null) {
				index = i;
				break;
			} 
		}
		boardList[index] = board;
	}
	
	public static void update() {
		System.out.println("# 게시글 수정");
		
		System.out.print("수정할 글 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (boardList[index] == null) {
			System.out.println("존재하지 않는 게시글입니다.");
			return;
		}
		
		System.out.print("title : ");
		String title = sc.nextLine();
		
		System.out.print("writer : ");
		String writer = sc.nextLine();
		
		System.out.print("content : ");
		String content = sc.nextLine();
		
		boardList[index].setTitle(title);
		boardList[index].setWriter(writer);
		boardList[index].setContent(content);
		System.out.println("수정 완료");
	}
	
	public static void delete() {
		System.out.print("삭제할 글 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (boardList[index] == null) {
			System.out.println("존재하지 않는 게시글입니다.");
			return;
		}
		
		boardList[index] = null;
		System.out.println("삭제 완료");
	}
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		
		do {
			// 메뉴판 출력
			System.out.println("########## 게시판 ##########");
			System.out.println("1. 게시판 목록");
			System.out.println("2. 게시판 읽기");
			System.out.println("3. 게시판 쓰기");
			System.out.println("4. 게시판 수정");
			System.out.println("5. 게시판 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("########## 입  력 : ");
			
			menuNo = sc.nextInt();
			sc.nextLine();
			
			switch (menuNo) {
			case 1: list(); break;
			case 2: read(); break;
			case 3: write(); break;
			case 4: update(); break;
			case 5: delete(); break;
			default: System.out.println("1~5번 까지만 입력가능합니다."); 
				break;
			}
			
		} while (menuNo != 0);
		System.out.println("종료");
	}
}
