package loops;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=i*fact;
			//System.out.println(i);
		}
			System.out.println(fact);
	}

}
