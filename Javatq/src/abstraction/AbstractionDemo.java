package abstraction;

 abstract class Bike{
	 abstract void run();
}
class Bajaj extends Bike{
	public void run(){
		System.out.println("Bajaj bike is running");
		
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Bajaj b=new Bajaj();
		b.run();
		
	}

}
