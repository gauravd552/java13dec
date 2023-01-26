package stringAssignment;
//Write a Java program to find first occurrence of a character in a given string.



public class CountOccurrences {

	public static void main(String[] args) {
		 String s = "Gaurav";
		  char search = 'g';             // Character to search is ''.
		  
		  int count=0;
		  for(int i=0; i<s.length(); i++)
		  {
		      if(s.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		  }
		}