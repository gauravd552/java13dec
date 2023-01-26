package string_written_assignment;

public class ReverseString {

	public static void main(String[] args) {
		String s="Gaurav Dixit";
		int count =0;
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
		System.out.println(s.charAt(i));
		count++;
		}
		System.out.println("Total number.."+count);

	}

}
