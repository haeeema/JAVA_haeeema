package Day15.Ex03_Employee;

public class EmplTest {
	public static void main(String[] args) {
		Employee e = new Account("Hong", "gold");
		Employee e1 = new Research("Lee", "silver");
		
		e.getEmpInfo(e);
		e1.getEmpInfo(e1);
	}
}
