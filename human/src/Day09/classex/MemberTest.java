package Day09.classex;

import java.util.Scanner;

public class MemberTest {
	// 속성, 메소드
	public static void main(String[] args) {
		/**
		//     객체이름 = 주소 생성자함수(멤버 변수를 초기화한다)
		Member member1 = new Member();
		
		System.out.println(member1);
		// 멤버를 그냥 프린트
		
		member1.setId("아이디");
		String id = member1.getId();
		System.out.println(id);
		
		Member member2 = new Member("java","java-pwd");
		// set method와 같은 기능
		
		String pwd = member2.getPwd();
		System.out.println("member의 id : " + id + ", member2의 pwd" + pwd);
		
		Address addr = new Address("서울", "영등포구", "영동");
		
		Member member3 = new Member("java2", "java2", addr);
		
		Address member3addr = member3.getAddress();
		
		System.out.println("member의 id : " + id + ", member2의 pwd" + pwd + ", member3의 addr" + addr);
		System.out.println(member3addr);
		**/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id : ");
		String id = sc.next();
		System.out.println("pwd : ");
		String pwd = sc.next();
		
		Member member = new Member();
		// Member member = new Member(id, pwd);
		// 1. 차이가 어떤건지? 차이없음 but 파라미터를 넣는 생성을 많이 쓴다.
		// 2. set이 왜 필요한건지? 차이없음
		
		member.setId(id);
		// 매개변수가 없는 생성자가 반드시 있어야한다. 주의!!
		System.out.print("입력 id : " + member.getId());
		System.out.println();
		
		member.setPwd(pwd);
		String getPwd = member.getPwd();
		System.out.print("입력 pwd : " + getPwd);
//		== System.out.println("입력 id : " + member.getId());
//		굳이 변수를 만들지 않아도 된다. 차이가 없다.
		System.out.println();
		
		//값변경
		member.setId("computerId");
		System.out.println("수정 id : " + member.getId());
		sc.close();
	}
}