package loops;

import java.util.Scanner;

public class Switch_From_user {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
		char choice=sc.next().charAt(0);
		int a=10,b=20;
		switch (choice)
		{
		case '+':
			System.out.println("addition is"+(a+b));
			break;
			
			case '-':
				System.out.println(" subtraction"+(a-b));
				break;
				
				case '*':
					System.out.println(" multiply is"+(a*b));
					break;
					
					
						
						case '/':
							System.out.println("Division is"+(a/b));
							break;
							
							default:
							System.out.println("wrong choise");
			
		
		}
		
		
		
	}

	}


