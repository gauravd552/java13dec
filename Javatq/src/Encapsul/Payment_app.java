package Encapsul;

public class Payment_app {

	public static void main(String[] args) {
		Customer c= new Customer();
		c.setC_id(10001);
		c.setBalance(20000);
		c.setAcc_no(1234);
		
		System.out.println(c.getC_id());
		System.out.println(c.getBalance());
		System.out.println(c.getAcc_no());
		
		
		//when we use 2000 for shopping 
		
		
		int x= c.getBalance()-2000;
		c.setBalance(x);
		System.out.println("amount debited");
		System.out.println("current balance is..."+c.getBalance());
	}

}
