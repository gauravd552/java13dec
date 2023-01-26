package class_object;

public class Vehicle {
	
	String company= "Bajaj";
	String name= "pulsur";
	String type="sport bike";
	float price=80000;
	
	
	void print()
	{
		System.out.println(" vehicle company"+ company);
		System.out.println("name"+ name);
		System.out.println("type"+type);
		System.out.println("price"+price);
		
		
	}
	

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.print();
		
		

	}

}
