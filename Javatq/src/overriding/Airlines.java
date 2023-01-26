package overriding;

import java.util.Scanner;

 class Airlines1 {
	
	
	void display(String s) {
		System.out.println("welcome to s.."+s);
	}
	void discount()
	{
		System.out.println("providing discount as per Airlines");
	}
}
	
	class Indigo extends Airlines1
	{
		float price =0;
		void discount()
		{
			super.discount();
			
		Scanner sc = new Scanner(System.in);
		System.out.println("1.. Mumbai to Delhi ----5000");
		System.out.println("2..Mumbai to pune -----3000");
		System.out.println("Enter your choice");
		int choice= sc.nextInt();
		
		
		
		switch(choice)
		{
		case 1:
			price=5000;
			cal_discount();
			break;
		case 2:
			price=3000;
			cal_discount();
			break;
		}
		}
		void cal_discount()
		{
			System.out.println("we are giving 5% discount on your ticket");
			price=price-0.05f;
			System.out.println("after giving discount on your ticket price .."+price);
			System.out.println("Thankyou have safe journey");
		}
	}
	public class Airlines{
		
	
	public static void main(String[] args) {
	      Airlines1 a;		      a= new Indigo();				a.display("Indigo Airlines");
				a.discount();
		
		Indigo i= new Indigo();
		i.discount();
		i.display("Indigo Airline");
		i.cal_discount();
		

	}

	}
	

