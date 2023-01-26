package arrays1;

public class FindPairs {

	public static void main(String[] args) {
		int a[]= {4,6,5,-10,8,2,5};
		int n=10;
		findThepairs(a,n);

	}

	private static void findThepairs(int[] a, int n) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+i;j<a.length;j++)
			{
				if(a[i]+a[j]==n) {
					System.out.println(a[i]+"+"+a[j]+"="+n);
				}
			}
		}
	}

}
