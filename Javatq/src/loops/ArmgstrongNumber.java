package loops;

import java.util.Scanner;

public class ArmgstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();
		int temp= n;
		int res= 0;
		while(temp>0) {
			int ld= temp%10;
			res= res+ld*ld*ld;
			temp= temp/10;
		}
		if (res==n) {
			System.out.println("Numbere is Armgstrong");
		}
		else
			System.out.println("Number is not Armgstrong");
		
		
		}

}
