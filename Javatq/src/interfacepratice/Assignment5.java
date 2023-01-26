package interfacepratice;
/*WAP to check whether final method of parent can be inherited in Child 
class*/

class Parent{
	final void display() {
		System.out.println("parent display method");
	}
}

class Child extends Parent{
	
}


public class Assignment5 {

	public static void main(String[] args) {
		Child c= new Child();
		c.display();

	}

}
