package ravipratice;

public class Mobile {
	
	
	int display(int x,int y)
	{
		int a=x*y;
		int b=x-y;
		return a;
	}

	public static void main(String[] args) {
		Mobile m= new Mobile();
int d=	m.display(20, 30);
		System.out.println(d);

	}

}
