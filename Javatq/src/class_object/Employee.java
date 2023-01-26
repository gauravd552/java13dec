package class_object;

public class Employee {
	
	int e_id=10;
	String name= "gaurav";
	String designation= "I.T";
	float salary= 20000;
	String department= "stack";
	String gender= "male";
	
	
	void print()
	{
		System.out.println("id is"+e_id);
		System.out.println("name"+name);
		System.out.println("designation"+designation);
		System.out.println("salary"+salary);
		System.out.println("department"+department);
		System.out.println("gender.."+gender);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e);//it gives the memory location
		e.print();//for print 
		e.salary= 22000;
		System.out.println("-----");
        e.print();
	}

}
