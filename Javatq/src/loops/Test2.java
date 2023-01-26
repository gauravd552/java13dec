package loops;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int add=0;
		
		for(int i=1;i<=num;i++)
		{
			add=add+i;
		}
		System.out.println(add);
	}

}
