package inheritance;
class Test{
void vehicle()
{
	System.out.println("Hero");
}
}
class Child1 extends Test
{
   void cycle()
   {
	   System.out.println("Ranger");
   }

public class Parent {
	
	public static void main(String[]args) {
		
		Child1 c = new Child1();
		c.cycle();
		c.vehicle();
	}
}
}
	
   
	
		
		
	
	


