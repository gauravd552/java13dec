package arrays1;

public class SumoFEvenOrOdd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sumodd=0;
		int sumeven=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				sumeven=sumeven+a[i];
				
			}
			else
			{
				System.out.println(a[i]);
				sumodd=sumodd+a[i];
			}
		}
		System.out.println("Sum is odd>>>"+sumodd);
		System.out.println("Sum is even  >>>"+sumeven);
	}
}