package arrays1;

import java.util.Scanner;

/*Write a program to find the sum and product and average of all elements of an array.*/
public class Jan_9_7 {

	public static void main(String[] args) {
		int a[],sum=0,prod=1,avg,num =5;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		a=new int[num];
		System.out.println("Enter array element");
		for(int i=0;i<num;i++)
		  {
            System.out.println("Enter the "+(i+1)+" element:");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++)
        {
            sum = sum + a[i];
            prod = prod * a[i];
        }
        avg = sum / num;
        System.out.println("Sum of array elements is: "+sum);
        System.out.println("Product of array elements is: "+prod);
        System.out.println("Average of array elements is: "+avg);
    }
}