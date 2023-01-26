package interfacepratice;
/*Create interface IceCream with method eat and Juice with method drink, 
//Create class Mastani which implements both interfaces*/

interface icecream{
	void eat();
	void juice();
		
	
}
class Mastani implements icecream{

	@Override
	public void eat() {
		System.out.println("eating mastani");
		
	}

	@Override
	public void juice() {
		System.out.println("drinking mastani");
		
		
		
	}
	
}



public class Assignment8 {

	public static void main(String[] args) {
		Mastani m= new Mastani();
		m.eat();
		m.juice();

	}

}
