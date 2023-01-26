package string_written_assignment;

/*Write a Java program to remove first and last occurrence of a word from 
string*/

public class RemoveFirstAndLastOccurance {

	public static void main(String[] args) {
		
		
String s = "Java is programming is language";
		
		String arr[] = s.split(" ");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals("is"))
			{
				s = s.replace("is", "");
				break;
			}
			
		}
		for(int i = arr.length-1; i >= 0; i--)
		{
			if(arr[i].equals("is"))
			{
				s = s.replace("is", "");
				break;
			}
			
		}
		System.out.println(s);
		
		
	}

}


