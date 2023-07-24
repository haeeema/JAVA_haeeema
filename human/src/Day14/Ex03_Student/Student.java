package Day14.Ex03_Student;

public class Student {
	String name;
	int grade;

	public Student() {
		System.out.println("Student super constructor call");
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getStudInfo() { // 학생의 신상정보를 출력해 주는 메서드
		System.out.println("Student 클래스의 getStudInfo( ) 호출");
		return "이름: " + name + ",학년: " + grade;
	}
}
