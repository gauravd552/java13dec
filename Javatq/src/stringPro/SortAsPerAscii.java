package stringPro;

public class SortAsPerAscii {

	public static void main(String[] args) {
		String arr[]= {"india","china","japan"};
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i].charAt(0)>arr[j].charAt(0)) {
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		

	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	
	

}
}