package class_object;
/*Create getId() method in Student class. call getId() method from 
displayData method so that you know that one method can be called from 
another method. Return id from getId() method and set that id to the 
instance variable in displayData method*/
public class Student3 {
	float getid;
	float getid()
	{
		return getid=123.4f;
		
	}
	void displaydata()
	{
		float a=getid();
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Student3 s= new Student3();//s is the object of student3
		s.displaydata();
		float res=s.getid();
		System.out.println(res);
		
		
	}

}
