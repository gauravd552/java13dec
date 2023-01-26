package abstraction;

public class AbstractionDemo4 {
	
	
	public abstract class Bank{
		//abstract method do not specify body
		public abstract int deposite(int amount);
		
		public abstract int withdraw(int withdraw);
		//common functionality for all vendors
		
		public  void smsnotification() {
			System.out.println("sms notification is trigged");
		}
	}
	
	class Hdfc  extends Bank{

		@Override
		public void deposite(int amount) {
			System.out.println("HDFC deposite method"+amount);
			
			
			
		}

		@Override
		public int withdraw(int amount) {
			System.out.println("HDFC withdraw method is called");
			return amount;
			
			
			
		}
		
	}
	class sbi extends Bank{

		@Override
		public void deposite(int amount) {
			System.out.println("Sbi deposite method");
			
		}

		@Override
		public int withdraw(int amount) {
		System.out.println("sbi withdraw method is called");
		return amount;
		 
			
		}
		
	}

	public static void main(String[] args) {
		
	}
}

	



	 
 
	

	

