package loops;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num=321;
		int flag=0;
		for(int i=2;i<num;i++)
		{
		if(num%i==0)
		{
			flag=1;
			
		}
		
		}
        if (flag==0)
        {
        	System.out.println(num+"prime number");
        }
        else
        	System.out.println(num+"not prime");
	}

}
