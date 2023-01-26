package string_written_assignment;

/*Write a Java program to convert uppercase string to lowercase (without 
using string function)*/

public class UppertoLower {

	public static void main(String[] args) {
		String s= "GAURAV DIXIT";
		char[] ch=s.toCharArray();
		//convert upper to lowercase
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' &&ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
		}
	}
		System.out.println(ch);

}
}
