package Day09;
//dto(data transfer object) vo(value object)
public class Member { 
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int age;
	private Address address;
	
	public Member() {
		
	}
	public Member(String id,String pwd) {
		this.id=id;
		this.pwd=pwd;
	}
	public Member(String id,int age) {
		this.id=id;
		this.age=age;
	}
	public Member(String id,String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public Member(String id,String name,String email,Address addr) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=addr;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", email=" + email + "]";
	}
	
	public void printMember() {
		System.out.println("ID : " + id);
		System.out.println("PWD : " + pwd);
		System.out.println("EMAIL : " + email);
	}
	
}
