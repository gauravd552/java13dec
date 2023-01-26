package ravipratice;

public class UseReturn {
	
	int  display(int x,int y)
	{
		int a= x+y;
		int b=x*y;
		return a;
		
	}
	
	
	
	
	public static void main(String[] args) {
		UseReturn u = new UseReturn();
		int b=u.display(20, 30);
		System.out.println(b);
		
		
		
		

	}

}
