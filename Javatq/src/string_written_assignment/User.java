package string_written_assignment;

public class User {
	
	
		private String username;
		private String password;
		
		public User() 
		{
			this.username = "gauravdixit552@gmail.com";
			this.password = "G.d@0000";
		}
		
		public void chkLoginDetails(String username,String password)
		{
			if(password.length() < 8)
			{
				System.out.println("Password must be 8 char long");
			}
			/*if((password.matches("^[@#]")))
			{
				System.out.println("at least one special @ or # character must be present");
			}*/
			if(! (password.matches("[0-9]")))
			{
				System.out.println("Password must contain at least one digit");
			}
			if(password.contains(" "))
			{
				System.out.println("Password must not have space");
			}
			if(! (password.matches("[A-Z]")))
			{
				System.out.println("Password must contain at least one uppercase letter");
			}
			if(this.username.equals(username) && this.password.equals(password))
			{
				System.out.println("Welcome");
			}


		
		
	}

}
