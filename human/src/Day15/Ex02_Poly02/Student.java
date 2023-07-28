package Day15.Ex02_Poly02;

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
	
	public void calcScore(Student st) {
		if (st instanceof University)
			System.out.println("University Calculation");
		else if (st instanceof Elementary)
			System.out.println("Elementary Calculation");
		// 코드가 늘어나는것 같지만 실행되는것은 하나!
	}
	
//	계속해서 비슷한 메소드가 계속 생김
//	public void calcScore(Elementary ele) {
//		System.out.println("Calculation");
//	}
}
