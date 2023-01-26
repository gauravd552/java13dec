package stringAssignment;
//Write a Java program to find reverse of a string
public class Reverse {

	public static void main(String[] args) {
		String s="Gaurav Dixit";
		int len=s.length();
		
	int	count=0;
		//length-1 use
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
			count++;
		}
     System.out.println("total number"+count);
	}

 

}
