package loops;

import java.util.Scanner;

public class Product_of_Digit_of_any_number {

	public static void main(String[] args) {
		int n,pro=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n= sc.nextInt();
		
		while(n>0)
		{
			pro=pro*n%10;
			n=n/10;
		}
		System.out.println("product of digit"+pro);
	}

}
