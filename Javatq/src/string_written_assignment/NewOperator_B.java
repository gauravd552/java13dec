package string_written_assignment;
/*Create 2 string using new and Compare string using == see different 
reference is there*/
public class NewOperator_B {

	public static void main(String[] args) {
		String s1=new String("Gaurav");
		String s2=new String("Gaurav");
		
		if(s1==s2)
		{
			System.out.println("Same reference");
		}
		else
		{
			System.out.println("Different refreence");
		}

	}

}
