package arrays1;

import java.util.Scanner;

/*Take 20 integer inputs from user and print the following: 
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
public class Jan_9_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,l,p=0,c=0,o=0,e=0,z=0;
		
		for(int i=1;i<=20;i++) {
			System.out.println("Enter number");
			
			n=sc.nextInt();
			
			
			if(n>0)
				p++;//count positive
			
			if(n<0)
				c++;//count negative
			
			if(n%2==0)
				e++;//count of even numbers
			if(n%2!=0)
				o++;//count of odd numbers
			if(n==0)
				z++;//count of zero
		}
		
		System.out.println("number of positive numbers"+ p++);
		System.out.println("number of negative numbers"+ c++);
		System.out.println("number of even numbers"+ e++);
		System.out.println("number of odd numbers"+ o++);
		System.out.println("number of zeros"+ z++);
	}

}
