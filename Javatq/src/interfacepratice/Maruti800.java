package interfacepratice;
/*What is abstraction show the code of real time example*/
//
abstract class Vehicle{
	int no_wheel;
	String colour;
	
	void displayName(String Name) {
		
		System.out.println("vehicle name is..."+Name);
		
	}
	Vehicle(int no_wheel,String colour){
		this.no_wheel=no_wheel;
		this.colour=colour;
	}
	abstract void engine();
	abstract void colour(String colour);
	abstract void clutch();
}


public class Maruti800 extends Vehicle{
	
	Maruti800(int no_wheel,String colour){
		super(no_wheel,colour);
	}

	@Override
	void engine() {
		System.out.println("Engine is started");
		
	}

	@Override
	void colour(String colour) {
		System.out.println("car colour is "+colour);
		
	}

	@Override
	void clutch() {
		System.out.println("clutch pressed");
		
	}
	
	public static void main(String []args) {
		
		Maruti800 m= new Maruti800(4,"Black");
		m.displayName("Maruti800");
		m.colour("Black");
		m.clutch();
		m.engine();
		
		
		
	}
	
}