package Day15.Ex01_Poly;

public class University extends Student {
	private int courses;

	public University(String name, int grade, int courses) {
		super();
		System.out.println("University constructor");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}

	public University() {
		this("Lee", 2, 20);
	}
	
	// 학점을 출력하는 메서드
	public int getCourses() {
		return courses;
	}
	
	@Override
	public String getStudInfo() { // 학생의 신상정보를 출력해 주는 메서드
		System.out.println("Student 클래스의 getStudInfo( ) 호출");
		return "이름: " + name + ",학년: " + grade + ",학점: " + getCourses();
	}
}
