package pratice;
import ravipratice.Parent;
public class Child {
 
	
	String name;
	int age;
	
	void display(String name,int x,float y)//method define 
	{
		this.name=name;
		this.age=x;
		
	}
	
	void show()
	{
		display("Gaurav",10,20.2f);//call 
		System.out.println(name);
	}


	public static void main(String[]args) {
		
		Child c=new Child();
		c.display("ram",150,50.5f);
		c.show();
		
	}

}
