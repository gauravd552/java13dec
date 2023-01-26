package Encapsul;
//pojo plane old java object
public class Customer {
	private int c_id;
	private	int balance;
	private int acc_no;
	
	
	//setter for customer id
	
	void setC_id(int c)
	{
		c_id=c;
	}
	
	//getter for customer id
	
	public int getC_id()
	{
		return c_id;
	}
	
	//setter for balance
	
	void setBalance(int b)
	{
		balance=b;
	}
	
	//getter for balance
	
	public int getBalance()
	{
		return balance;
	}
	
	
	//setter for acc no
	
	void setAcc_no(int a)
	{
		acc_no=a;
	}
	
	//getter method for acc_no
	
   public	int getAcc_no()
	{
		return acc_no;
	}
	

}
