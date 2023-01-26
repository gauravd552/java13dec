package statickeyword;
/*Check following variations:
a.	Static variable and Non-Static (Instance Variable) – Just declare and print it.
b.	See if you can access static variable in static method
c.	non static variable in static method
d.	then static variable in non-static method
e.	non static variable in non-static method Note: non static means instance variable*/
public class CheckVeriations {
	
	
	int a=20;
	static int b=40;
	void display()
	{
		b=80;
		a=90;
	}

	public static void main(String[] args) {
		CheckVeriations c= new CheckVeriations();
		System.out.println(c.a);
		System.out.println(c.b);
		b=50;
		c.display();
		System.out.println(c.a);
		System.out.println(c.b);
		
		
		

	}

}
