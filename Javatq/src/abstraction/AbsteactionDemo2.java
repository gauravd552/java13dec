package abstraction;

abstract class Parent{
	public Parent()
	{
		System.out.println("may parent ka constructor hu");
	}
	public void sayHi() {
		System.out.println("Hi");
	}
	abstract public void greet();
	
}

class Child extends Parent{
	
	public void greet(){
		System.out.println("Good morning");
		
	}
}
abstract class Child2 extends Parent{
	public void th() {
		System.out.println("i am fine ");
	}
}



public class AbsteactionDemo2 {

	public static void main(String[] args) {
		Child c=new Child();
		c.greet();
		
		
	}

}
