package ravipratice;

public class Student {
	
	int rollno;
	String name;
	static String sc_name;
	static String sc_ground;
	String xyz;
	
	void display()
	{
	  System.out.println("roll no="+ rollno); 
	  System.out.println("student name="+ name);
	  
	}
	
	static  void common()
	{
		System.out.println("school name="+ sc_name); 
		  System.out.println("school ground="+ sc_ground);
		  
		
	}

}
