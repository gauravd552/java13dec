package ravipratice;

public class MethodCall {
	
	void method1()
	{
		System.out.println("method 1");
	}
	void method2(int x,String name)
	{
		System.out.println("method 2");
	}
	void method3(String name,int rollno )
	{
		System.out.println("method 3");
	}
	void method4(int y)
	{
		System.out.println("method 4");
	}
	void method5(int z)
	{
		System.out.println("method 5");
	}
	void method6(String designation)
	{
		
	}
	void method7(String dept)
	{
		System.out.println("method 7");
	}
	void method8(float salary,int id)
	{
		System.out.println("method 8");
	}
	void method9(String surname)
	{
		System.out.println("method 9");
	}
	void method10(int a)
	{
		System.out.println("method 10");
	}



public static void main(String[] args) {
	
	MethodCall m=new MethodCall();
	m.method1();
	m.method2(10,"Ram");
	m.method3("Gaurav",1);
	m.method4(20);
	m.method5(30);
	m.method6("Developer");
	m.method7("I.T");
	m.method8(20000,121);
	m.method9("Dixit");
	m.method10(40);
	

	
	
	
}
}