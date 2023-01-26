package pratice;

public class Mock {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int num=10;
		//find the pairs whose from is given numbers
		//addition
		int n=arr.length;
		int sum=0;
		
				
		for(int i=0;i<n;i=i+2) {
			sum =sum+arr[i];

			
		}
		System.out.println("sum of alternative number...."+sum);
		
	

}
}