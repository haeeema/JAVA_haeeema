package Day14.Ex05_Super;

public class UniversityEx {
	public static void main(String[] args) {
		String name = null;
		int grade = 0;
		int courses = 0;
		
		University u = new University("Lee", 5, 12);
		
		name = u.getName();
		grade = u.getGrade();
		courses = u.getCourses();
		System.out.println(name + grade + courses);
	}
}
