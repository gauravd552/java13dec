package loops;

import java.util.Scanner;

public class Chocklet {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of chocklets");
		int no=sc.nextInt();
		int cnt=0;
		
		for(int i=1;i<=no;i++)
		{
			cnt++;
			if(cnt%3==0)
			{
				cnt++;
			}
		}
		System.out.println("Final quantity is "+ cnt);
	}
	

}
