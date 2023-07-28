package Day15.Ex01_Poly;

public class Elementary extends Student {

	public Elementary(String name, int grade, int point) {
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