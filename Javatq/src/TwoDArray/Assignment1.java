package TwoDArray;
//wAP to accept data in 2D array of 3X4 and accept data
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		int m,n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		m=sc.nextInt();
		System.out.println("Enter the number of coloums");
		n=sc.nextInt();
		
		int array [][]=new int[m][n];
		System.out.println("Enter the elements of array");
		
		//loop for row  
		for (i = 0; i < m; i++) 
			
		//inner for loop for column  
		for (j = 0; j < n; j++)   
		array[i][j] = sc.nextInt(); 
		
		//accessing array elements   
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < m; i++)   
		{   
		for (j = 0; j < n; j++)   
		//prints the array elements  
		System.out.print(array[i][j] + " ");   
		//throws the cursor to the next line  
		System.out.println();   
		}   
		}   
		
		
	}


