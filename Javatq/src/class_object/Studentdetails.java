package class_object;
/*Now id, name in student class. assign value to id, name there Itself and in 
main method print values then change value of instance variables and again 
print the values (Observe you cannot access id directly without creating 
object)*/
public class Studentdetails {
	
	int id=123;
	String name="Gaurav";
	int rollnumber=1;
	

	public static void main(String[] args) {
		Studentdetails s= new Studentdetails();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.rollnumber);
		s.rollnumber=2;
		System.out.println(s.rollnumber=2);
		s.id=1234;
		System.out.println(s.id=1234);
		s.name="Ravi";
		System.out.println(s.name="Ravi");

	}

}
