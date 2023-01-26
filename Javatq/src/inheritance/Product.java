package inheritance;

public class Product extends Mobile{
	
	String model_number;
	
	Product(int id,String name,String model_number)
	{
		super( id, name);//call the parent class or mobile class
		this.model_number=model_number;
		
	}
	
	
	

}
