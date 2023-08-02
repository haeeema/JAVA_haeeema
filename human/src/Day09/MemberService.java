package Day09;
//외부에서 요청 처리

public class MemberService {
	final int MAX_CNT = 3;
	Member member[] = new Member[MAX_CNT];
	int cnt = 0;
	
	// 1. 회원입력
	public void inputData() {
	
		System.out.println("회원입력");
		System.out.print("ID : ");
		String id=InputScanner.sc.next();
		System.out.print("PWD : ");
		String pwd=InputScanner.sc.next();
		System.out.print("EMAIL : ");
		String email=InputScanner.sc.next();
		
		// 입력한 내용을 객체로 생성후 배열에 저장한다.
		member[cnt++] = new Member(id, pwd, email);
		
		System.out.println("데이터 입력 완료");

	}
	// 2. 회원조회
	public void searchData() {
		// 이름으로 검색한다.
		// 검색: compareTo() 메소드 사용한다.
		// 삭제, 변경 사용시 자료를 검색한다.
		// 공통 메소드 작성 ( search(String name))
		System.out.println("데이터 검색합니다.");
		System.out.print("id : ");
		
		String id = InputScanner.sc.next();
		
		int index = search(id);
		
		if (index < 0) {
			System.out.println("데이터가 없음");
		} else {
			// 해당 검색 데이터를 출력한다.
			member[index].printMember();
			System.out.println(member[index].toString());
			System.out.println("데이터 검색 완료");
		}
		for (int i = 0; i < member.length; i++) {
			System.out.print(member[i]);
			System.out.println(">>" + i);
		}
	}
	
	private int search(String id) {
		// 매개변수 name과 배열에 있는 이름 비교
		for (int i = 0; i < cnt; i++) {
			Member mem = member[i];
			if (id.compareTo(mem.getId()) == 0)
				return i;
		}
		return -1;
	}
	
	public void updateData() {
		
	}
	
	public void deleteData() {
		System.out.println("데이터 삭제합니다.");
		System.out.print("id : ");
		
		String id = InputScanner.sc.next();
		
		int index = search(id);
		
		if (index < 0) {
			System.out.println("데이터가 없음");
		} else {			
			for (int i = index; i < member.length - index - 1; i++) {
				//member.length - index - 1
				member[i] = member[i + 1];
				member[MAX_CNT] = null;
			}
			cnt--;
		}
		
		System.out.println("데이터 삭제 완료");
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i]);
		}
	}
	
	
	public static void totalPrint() {
		
	}

}
