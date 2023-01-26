package stringAssignment;

import java.util.Scanner;

public class LastOccurance {

	
		public static void main(String[] args) {
			String s="Gaurav Dixit";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter  charcter");
			int flag=0;
			int count=0;
			char c=sc.next().charAt(0);
			char ch[]=s.toCharArray();
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==c)
				{
					flag=1;
					count=i;
					
				}
			}
			if(flag==1)
			{
				System.out.println(c  +"is present at index..."+count);
			}
			else
			{
				System.out.println(c+"is not present");
			}
			
			
		

	


	}

}
