package class_object;
//method overloading means same method name performing different task but by using diff. parameter
public class Methodloading {
	void calculate(int a,int b)
	{
		System.out.println(a+b);
	}
	void calculate(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void calculate(int a,int b,int c, int d)
	{
		System.out.println(a+b+c+d);
	}
	

	public static void main(String[] args) {
		Methodloading m= new Methodloading();
		m.calculate(12,34);
		m.calculate(12, 34, 56);
		m.calculate(12, 34, 56, 89);
	}

}
