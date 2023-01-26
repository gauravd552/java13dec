package statickeyword;

public class Student {
	int id;
	String name;
	
	

	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println("id...."+id);
		System.out.println("name...."+name);
		
		
	}



	public static void main(String[] args) {
		Student s= new Student(1,"Ram");
		s.display();
		System.out.println(s);
		Student s1=s;
		s1.display();
		System.out.println(s1);
		s1.id=101;
		s1.display();
		s.display();

	}

}
