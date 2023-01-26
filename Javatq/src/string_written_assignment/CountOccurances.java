package string_written_assignment;
//Write a Java program to count occurrences of a word in a given string.
public class CountOccurances {

	public static void main(String[] args) {
		String s="india is my country";
		int count =0;
		
		char search = 'i';
		for(int i=0;i<s.length();i++)
		{
			 if(s.charAt(i)== search)
			      count++;
		}
		System.out.println("The Character '"+search+"' appears "+count+" times.");
		

	}

}
