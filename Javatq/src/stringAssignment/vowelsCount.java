package stringAssignment;
//Write a Java program to count total number of vowels and consonants in a string.
//vimp
public class vowelsCount {

	public static void main(String[] args) {
		String s1="India is my country";
		 
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
			{
				System.out.println(ch);
				count++;
				
			}
		}
		System.out.println("total number "+count );

	}

}
