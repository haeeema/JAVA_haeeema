package Day14.Ex03_Student;

public class StudentTest {
	public static void main(String[] args) {
		
		String sinsang = null;
		Elementary e = new Elementary("이순신", 2);
		University u = new University("홍길동", 3, 20);
		
		// Polymorphism upcasting
		System.out.println("Polymorphism ############");
		Student st2 = new Elementary("java", 5);
		System.out.println(st2.getStudInfo());
		st2 = new University("java2", 4, 20);
		System.out.println(st2.getStudInfo());
		System.out.println();
		
		sinsang = e.getStudInfo(); // 부모의 메서드 호출
		System.out.println("학생 정보: " + sinsang);
		
		sinsang = u.getStudInfo();
		System.out.println("학생 정보: " + sinsang + ", 수강학점: " + u.getCourses() + "점");
	}
}
