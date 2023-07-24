package Day14.Ex05_Super;

public class Student {
	protected String name;
	protected int grade;

	public Student() {
		System.out.println("Student 부모 생성자 호출");
	}

	public Student(String _name, int _grade) {
		name = _name;
		grade = _grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo( ) 호출");
		return "이름은 : " + name + "학년은 : " + grade;
	}
}
