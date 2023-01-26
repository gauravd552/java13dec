package Encapsul;

public class Department {
	
	int d_id;
	String  d_name;
	
	 public Department(int d_id,String d_name)
	{
	this.	d_id=d_id;
	this.	d_name=d_name;
	}
	
	void display()
	{
		Gretting();//internally compier this keyword lagata hay we can not see
		System.out.println("Department id,,,"+d_id);
		System.out.println("Department name"+d_name);
	}
	void Gretting()
	{
     System.out.println("welcome to our Department");
	}

	public static void main(String[] args) {
		Department d1 = new Department(1,"HR");
		d1.display();
		Department d2 = new Department(2,"Account");
		d2.display();
	}

}
