package Day15.Ex02_Poly02;

public class Elementary extends Student {

	public Elementary(String name, int grade, int point) {
		System.out.println("Elementary constructor call");
		super.name = name;
		super.grade = grade;
	}
	
	public Elementary(String name, int grade) {
		super.name = name;
		super.grade = grade;
	}
	
	public Elementary() {
		this("Lee", 3);
	}
}