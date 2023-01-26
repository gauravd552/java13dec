package arrays1;
/*Take 10 integer inputs from user and store them in an array and print them 
on screen.*/
import java.util.Scanner;

public class Jan9_1 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the number of elements want to store");
		n=sc.nextInt();
		 int arr[]= new int[10];
		 System.out.println("Enter the elements");
		 
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
			 System.out.println("Array elements are");
		 }
		 for (int i=0;i<n;i++)
		 {
			 System.out.println(arr[i]);
		 }

	}

}
