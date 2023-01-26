package stringPro;

public class Methods {
	
	static void findlen(char ch[])
	{
		int count =0;
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
			count++;
		}
		System.out.println(count);
	}
	
	

	public static void main(String[] args) {
		String s="hello";
		//System.out.println(s.length());
		char ch[]=s.toCharArray();
		
		findlen(ch);

	}

}
