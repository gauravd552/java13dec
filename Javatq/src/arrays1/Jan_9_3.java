package arrays1;

import java.util.Scanner;

/*Take 10 integer inputs from user and store them in an array. Again ask user 
to give a number. Now, tell user whether that number is present in array or not*/
public class Jan_9_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int arr[]=new int[10];
		boolean present=true;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number you want to check");
		int number=sc.nextInt();
		for(int j:arr) {
			
			if(j!=number);
			present=false;
			
		}
		System.out.println("present");
		
	}

}
