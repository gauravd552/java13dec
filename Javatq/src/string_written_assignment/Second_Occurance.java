package string_written_assignment;

import java.util.Scanner;

/*Write a Java program to find second occurrence of a character in a given 
string*/
public class Second_Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = "Gaurav Dixit";
		
		System.out.println("Enter the character : ");
		char c = sc.next().charAt(0);
		
		char ch[] = s.toCharArray();
		
		int flag = 0;
		int i = 0,cnt = 0;
		
		for(i = 0; i < ch.length; i++)
		{
			if(ch[i] == c)
			{
				cnt++;
				
			}
			if(cnt == 2)
			{

				flag = 1;
				break;
			}
		}
		System.out.println("Character second occures at position : "+i);

	}

}
