package string_written_assignment;
// Write a code to prove that strings are immutable in java
public class Strings_Immutable {

	public static void main(String[] args) {
		
		String s="Gaurav";
		s.concat("Dixit");////concat() method appends the string at the end 
		System.out.println(s);//will print Gaurav because strings are immutable objects  

	}

}
