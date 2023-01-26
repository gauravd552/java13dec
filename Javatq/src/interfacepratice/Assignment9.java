package interfacepratice;
/*. Which of the following is true about interfaces in java? 
a. An Interface can contain following type of members.
 …….public, static, final fields (i.e. constants)
 …….default and static methods with bodies
b. An instance of interface can be created.
c. A Class can implement multiple interfaces.
d. Many classes can implement same interface*/

interface inturf{
	public static final int x=10;
	default void display() {
		System.out.println("this is default");
		
	}
	static void show() {
		System.out.println("this is static ");
	}
}
interface inturf2{
	void m1();
	void m2();
}


class Many implements inturf,inturf2{

	@Override
	public void m1() {
		
		System.out.println("method is m1");	
		
		
	}

	@Override
	public void m2() {
		System.out.println("method is m2");	
		
	}
	
}




public class Assignment9 {

	public static void main(String[] args) {
		Many m= new Many();
		m.display();
		m.m1();
		m.m2();
		inturf.show();
		
	
	}

}
