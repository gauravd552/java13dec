package loops;

import java.util.Scanner;

public class Prime_numbers_between_400to300 {

	public static void main(String[] args) {

   Scanner sc= new Scanner(System.in);
   System.out.println("Enter start and end range");
   
   int num1= sc.nextInt();
   int num2= sc.nextInt();
   
   System.out.println("prime numbers: are");
   for(int i=num1;i<=num2;i++) {
	   int n=i;
	   int a=2;
	   int temp= 0;
	   
	   while(a<=(n/2)) {
		   if((n%a)==0) {
			   temp++;
			   
			  
			 
		   }
		   a++;
	   }
	   if(temp==0)
		   System.out.println(i+"   ");
		   
	   
   }
   
   

	}

}
