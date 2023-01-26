package string_written_assignment;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String u_name = sc.nextLine();
		
		System.out.println("Enter password : ");
		String u_pass = sc.nextLine();
		
		User u = new User();
		
		u.chkLoginDetails(u_name,u_pass);
	}


}
