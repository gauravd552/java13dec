package array_of_Object;
//one supplier suppling one item 
//one to one relation
public class Item {
	String item_name;
	int price;
	public Item(String item_name, int price) {
		super();
		this.item_name = item_name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [item_name=" + item_name + ", price=" + price + "]";
	}
	
	
	

}