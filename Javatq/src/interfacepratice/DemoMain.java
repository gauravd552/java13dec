package interfacepratice;
/*Create a class Demo. In class Demo, declare a member 
variable x of type int as final.
In main method -
a. Create an object of type Demo. Try to change the value of x.
b. Now declare and implement a method display and 
make it final. Create a class DemoChild which 
extends Demo. In DemoChild, try to override the 
method display.
c. Now declare the class DemoChild as final 
and try to extend the class DemoChild*/

   final class Demo {
	   //The type DemoMain cannot subclass the final class Demo
	final  int x=10;
	final void display() {
		System.out.println("Demo display");
	}
  }
  
  




public class DemoMain extends Demo{
	//Cannot override the final method from Demo
	//void display() {
		
	//}

	public static void main(String[] args) {
		Demo d=new Demo();//The final field Demo.x cannot be assigned
		//d.x=20;
	}

}
