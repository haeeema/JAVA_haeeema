package Day14.Ex03_Student;

public class StudentTest {
	public static void main(String[] args) {
		
		String sinsang = null;
		Elementary e = new Elementary("이순신", 2);
		University u = new University("홍길동", 3, 20);
		
		sinsang = e.getStudInfo(); // 부모의 메서드 호출
		System.out.println("학생 정보: " + sinsang);
		
		sinsang = u.getStudInfo();
		System.out.println("학생 정보: " + sinsang + ", 수강학점: " + u.getCourses() + "점");
	}
}
