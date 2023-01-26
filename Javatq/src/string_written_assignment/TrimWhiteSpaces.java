package string_written_assignment;
//Write a Java program to trim leading white space characters in a
public class TrimWhiteSpaces {

	public static void main(String[] args) {
		
		String s=" Gaurav Dixit is very friendly person";
		
	char []ch=	s.toCharArray();
	String str="";
	for(int i=0;i<ch.length;i++)
	{
	if(ch[i]!=' ')	{
		str= str+ch[i];
		
	}
	}
	System.out.println(str);

	}

}

//replace method can also use here 

