package string_written_assignment;

public class AllAlphabateocc {

	public static void main(String[] args) {
String str = "gaurav dixit";
		
		char ch[] = str.toCharArray();
		
		int cnt[] = new int[26];
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				int pos = ch[i] - 97;
				cnt[pos]++;
			}
			
		}
		
		for(int i = 0; i < cnt.length; i++)
		{
			if(cnt[i] > 0)
			{
				System.out.println((char) (i + 'a') + " count is : "+cnt[i]);
			}
			
		}
	}



	}


