package stringPro;

import java.util.StringJoiner;

public class VovelsAndNumber {

	public static void main(String[] args) {
		String s="window";
		String s2="Number";
		
		StringJoiner sj=new StringJoiner(" ");
		sj.add(s);
		sj.add(s2);
		
		String s3=sj.toString();
		char arr[]=s3.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u' ) {
				
				int x=arr[i];
				System.out.println(arr[i]+"....."+x);
				
			}
			System.out.println("");
		}
		
					

	}

}
