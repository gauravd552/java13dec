package stringAssignment;

public class PaildromeString {

	public static void main(String[] args) {
		String s="mam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("givien string is palindrom");
		}
		else {
			System.out.println("givien string is  not palindrom.....");
		}
	}

}
