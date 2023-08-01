package Day19.Ex01_ArrayList;

public class Product {
	private String code;
	private String name;
	private String color;
	private int qty;
	
	public Product() {
		this("0001", "smartphone", "black", 100);
	}

	public Product(String code, String name, String color, int qty) {
		this.code = code;
		this.name = name;
		this.color = color;
		this.qty = qty;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", color=" + color + ", qty=" + qty + "]";
	}
}
