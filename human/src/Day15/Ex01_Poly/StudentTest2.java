package Day15.Ex01_Poly;

public class StudentTest2 {
	public static void main(String[] args) {
		
		Student s = new University("Hong", 3, 20);
		
//		System.out.println(s.getCourse());
		
		// Downcasting
		University u = (University) s;
		
		System.out.println("score: " + u.getCourses());
	}
}
