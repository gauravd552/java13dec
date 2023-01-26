package arrays1;
/*Take 10 integer inputs from user and store them in an array. Now, copy all 
the elements in another array but in reverse order*/

import java.util.Scanner;


public class Jan_9_5 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		 n=sc.nextInt();
		 int arr[]=new int[n+1];
		 System.out.println("Enter all Elements");
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Reversed array is:  ");
		 
		 
		 for(int i=n-1;i>0;i--)
		 {
			 System.out.println(arr[i]+"  ");
		 }
		 
		
		
	}

}
