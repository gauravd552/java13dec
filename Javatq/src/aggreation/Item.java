package aggreation;

public class Item {
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	

}
