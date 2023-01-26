package array_written_14jan;

public class FindMinChar {
	
		public static void main(String[] args) {
			
			char [] arr= {'S','R','A','B','T','W','Q','Z'};
			char min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			System.out.println(min);
		}

	}


