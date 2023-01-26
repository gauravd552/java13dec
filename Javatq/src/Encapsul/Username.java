package Encapsul;

class CheckPassword
{
	String user="Ram";
	 private String pass="1234";
	String check()
	{
		return "1234";
	}
}


    public class Username {
    
	
	public static void main(String[] a)
	{
		CheckPassword c=new CheckPassword();
		String s1=c.check();
		System.out.println(c.check());
		if(s1.equals("1234"))
		{
			System.out.println("welcome"+c.user);
		}
		else
			System.out.println("not a correct user");
		
		
	}

}
    


	