package stringPro;

public class Lowercase {

	public static void main(String[] args) {
		String s="hello";
		//to convert sting in lowercase
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(ch[i]-32);
		}
		String s1=new String(ch);
		System.out.println(s1);
		
		//its concate method
		
	s=	s.concat("Java");
		System.out.println(s);
				

	}

}
