package loops;

import java.util.Scanner;

public class Sum_of_all_Odd_numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int n= sc.nextInt();
		int sum= 0;
		
		for(int i = 1; i<n ;i++)
		if((i%2)==0)
		sum= sum+i;
			
			System.out.println("The sum of sll odd numbers from 1 to "+n+"is"+ sum);
			
	}

}
