package statickeyword;
//Create two object of Car class and change value of static variable by 1st object and print it by accessing 2nd object.
public class Car1 {
static  String name="Tata";
	
	
	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		c1.name="Range Rover";
		System.out.println(c1.name);
		Car1 c2= new Car1();
		System.out.println(c2.name);
	

	
		
		

	}
}


