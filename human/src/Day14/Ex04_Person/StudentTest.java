package Day14.Ex04_Person;

public class StudentTest {
	public static void main(String[] args) {
		String sinsang = null;
		String gender = null;
		int age = 0;
		
		Elementary e = new Elementary("Lee", 2, "male", 15);
		
		sinsang = e.getStudInfo();
		System.out.println("*Infomation\n" + sinsang);
		
		gender = e.getGender();
		age = e.getAge();
		System.out.println("gender : " + gender + ", age : " + age);
	}
}
