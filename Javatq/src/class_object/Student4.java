package class_object;
/*Add display method inside Student class change values of id, name in that 
method & also print the changed values in same method. Call display 
method from main method.*/


public class Student4 {
	int id=1234;
	String name="Gaurav";
	void display()
	{
		System.out.println(" old Value of id ="+id);
		System.out.println("old name"+name);
		id=4321;
		name="ravi";
		System.out.println("new value of id="+id);
		System.out.println("new name="+name);
		
	}
	void m1()
	{
		display();
	}
	void m2()
	{
		display();
		m1();
	}
	

	public static void main(String[] args) {
		Student4 s=new Student4();//s is object
		s.display();
		s.m2();
		

	}

}
