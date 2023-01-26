package arrays1;

public class Minimum {

	public static void main(String[] args) {
		int arr[]= {31,46,58,89,45,20};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Enter minimum number...."+min);

	

}
}