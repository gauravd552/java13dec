package class_object;

public class Fact1 {
	
	void cal(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			 fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Fact1 f= new Fact1();
		f.cal(5);
				
	}

}
