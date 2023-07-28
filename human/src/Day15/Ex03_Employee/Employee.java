package Day15.Ex03_Employee;

public class Employee {
	protected String name;
	protected String job;

/*
	public Employee() {
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, String job) {
		this.name = name;
		this.job = job;
	}

	Subclass에서 위 생성자 3개를 대체함
*/ 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void getEmpInfo (Employee e) {
		if (e instanceof Account) {
			System.out.println("Rank : " + e.getJob());
		} else if (e instanceof Research) {
			Research res = (Research) e;
			System.out.println("Rank : " + res.getPosition());
		}
	}
}
