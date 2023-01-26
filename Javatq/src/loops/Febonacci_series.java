package loops;

public class Febonacci_series {

	public static void main(String[] args) {
		int k,a=0,b=1;
		k=0;
		System.out.println("  " );
		for (int i=1;i<=10;i++) {
			k=a+b;
			System.out.println(k+"   ");
			a=b;
			b=k;
			
		}
	
		
	}

}
