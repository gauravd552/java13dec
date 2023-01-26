package statickeyword;

public class StaticVariable {
	
	 int i=1;
	 
	 void display()
	 {
		 i++;
	 }
	
	
	public static void main(String[] args) {
		StaticVariable s= new StaticVariable();
		System.out.println(s.i);
		s.display();
		System.out.println(s.i);
		System.out.println("-------  object" );
		StaticVariable s2= new StaticVariable();
		System.out.println(s2.i);
		s2.display();
		System.out.println(s2.i);
		
	}

}
