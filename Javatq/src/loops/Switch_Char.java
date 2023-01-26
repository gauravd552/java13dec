package loops;

public class Switch_Char {

	public static void main(String[] args) {
		char choice= 'c';
		int a=10,b=20;
		switch (choice)
		{
		case 'a':
			System.out.println("addition is"+(a+b));
			break;
			
			case 'b':
				System.out.println(" subtraction"+(a-b));
				break;
				
				case 'c':
					System.out.println(" multiply is"+(a*b));
					break;
					
					
						
						case 'd':
							System.out.println("Division is"+(a/b));
							break;
							
							default:
							System.out.println("wrong choise");
			
		
		}
		
		
		
	}

}
