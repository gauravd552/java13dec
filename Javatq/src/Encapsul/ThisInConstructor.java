package Encapsul;
//constructor chaning : when you can call one constructor from another constructorusing this keyword
public class ThisInConstructor {
	
	
	ThisInConstructor()
	{
		this(10);
		System.out.println("default constructor");
	}
	ThisInConstructor(int x)
	{
		this(20,30);
		System.out.println(" constructor with single value");
		System.out.println( x);
	}
	ThisInConstructor(int x,int y)
	{
		System.out.println(" constructor with two value");
		System.out.println(x+"  "+y);
	}
	

	public static void main(String[] args) {
		ThisInConstructor t= new ThisInConstructor();

	}

}
