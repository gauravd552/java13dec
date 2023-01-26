package arrays1;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {13,34,45,67,77,565,443,89};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		System.out.println("Second largest number is"+a[1]);

	}

}
