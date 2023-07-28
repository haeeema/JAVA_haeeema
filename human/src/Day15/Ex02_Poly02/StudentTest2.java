package Day15.Ex02_Poly02;

public class StudentTest2 {
	public static void main(String[] args) {
		
		Student u = new University("Hong", 3, 23);
		u.calcScore(u);
		
		Student e = new Elementary("Park", 2, 19);
		e.calcScore(e);
	}
}
