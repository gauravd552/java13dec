package string_written_assignment;

public class PailndromeNumber {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("given is pailndrome");
		}
		else {
			System.out.println("not Pailndrome");
		}
	}

}
