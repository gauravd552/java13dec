package stringPro;

public class Contains {

	public static void main(String[] args) {
		String s="Java is Programming langauge";
		boolean b=s.contains("progaramming");
		if(b==true)
		{
			System.out.println("Given word is present....");
		}else
		{
			System.out.println("not present...");
		}

	}

}
