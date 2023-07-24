package Day14.Ex03_Student;

public class Elementary extends Student {

	public Elementary(String _name, int _grade) {
		System.out.println("Elementary 생성자 호출");
		name = _name; // 부모의 멤버 변수에 접근한다.
		grade = _grade;
	}
}