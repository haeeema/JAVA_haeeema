package Day09.classex;
//dto(data transfer object), vo(value object)
public class Member {
	private String id;
	private String pwd;
//	private String name;
//	private String email;
	private Address address;
	
	// 초기화 되는지 확인하기 위함
	public Member() {
//		System.out.println("생성자 메소드");
//		System.out.println("id = " + id);
//		System.out.println("pwd = " + pwd);
//		System.out.println("name = " + name);
//		System.out.println("email = " + email);
	}
	
	public Member(String id, String pwd, Address address) {
		this.id = id;
		this.pwd = pwd;
		this.address = address;
	}
	
	public Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", address=" + address + "]";
	}

	
	// toString을 쓰면 주소대신 나와주는것 같다.
	// 개별적인 값은 한 문장으로 만들어준다.
}
