package arrays1;
   
class A{
	void add(int ...a) {
		int sum=0;
		for(int x:a) {
			sum=sum+x;
			
		}
		System.out.println("sum of numbers "+sum);
		
		
		
	}
}


public class VareArgs {

	public static void main(String[] args) {
		A d =new A();
		d.add();
		d.add(10);
		d.add(10,20);
		d.add(10,20,30);
		d.add(10,20,30,40);

	}

}
