package stringPro;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance =1000;
		System.out.println("Enter the amount deposited");
		int amt=sc.nextInt();
		String str;
		do {
			balance=balance+amt;
			System.out.println("Do you want to continue yes/no");
			str=sc.next();
		}while(str.equalsIgnoreCase("yes"));
		System.out.println("balance.."+balance);
		

	}

}
