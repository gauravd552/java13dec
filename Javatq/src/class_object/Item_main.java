package class_object;

class Item
{
	
	String i_name;
	int quantity;
	int price;
	
void print()
{
	
	System.out.println("Item name is.."+i_name );
	System.out.println("quantity.."+quantity );
	System.out.println("price.."+price );
	
	
}
	
	
	
	
}







public class Item_main {

	public static void main(String[] args) {
		Item item1= new Item();
		Customer c=new Customer();
		item1.i_name = "washing machine";
		item1.quantity=2;
		item1.price=20000;
		c.print();
		item1.print();

	}

}
