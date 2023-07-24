package Day14.Ex04_Person;

public class Student extends Person {
	protected String name;
	protected int grade;
	
	public Student() {
		System.out.println("Student super conductor");
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getStudInfo() {
		System.out.println("getInfo() in Student class");
		return "name : " + name + ", grade : " + grade;
	}
}
