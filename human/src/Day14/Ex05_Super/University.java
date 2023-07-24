package Day14.Ex05_Super;

public class University extends Student {
	private int courses;

	public University(String name, int grade, int courses) {
		//super();
		super(name, grade);
		System.out.println("University constructor");
		super.name = name; // 가독성이 좋아진다.
		super.grade = grade;
		this.courses = courses;
	}

	public int getCourses() {
		return courses;
	}
}
