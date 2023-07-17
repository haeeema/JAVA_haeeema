package Day09.classex;

/**
 * 클래스간의 상속, 포함관계 공부하기
 */

public class MemberTest {
	// 속성, 메소드
	public static void main(String[] args) {
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
	}
}