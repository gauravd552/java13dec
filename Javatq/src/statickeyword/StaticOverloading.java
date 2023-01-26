package statickeyword;
//See if you can overload static method, by using static keyword for 2nd overloaded method and without using static keyword.
public class StaticOverloading {
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	static int add(int a, int b,int c,int d)
	{
		return a+b+c+d;
	}

	public static void main(String[] args) {
		int a=add(10, 20);
		System.out.println(a);
		int b=add(30,40,50);
		System.out.println(b);
		int c=add(70,60,20,90);
		System.out.println(c);
		
	

	}

}
