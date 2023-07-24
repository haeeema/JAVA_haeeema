package Day14.Ex06_This;

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
		this("JAVA", 2, 20); // 인자가 3개인 생성자를 재호출한다.
	}
	
	// parameter가 main에서 안들어오고 superclass에서 들어온다.

	public int getCourses() {
		return courses;
	}
}
