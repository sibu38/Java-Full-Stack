package com.exception;

class InsufficientBalanceException extends Exception
{
	String msg;
	public InsufficientBalanceException() 
	{
		this.msg="";
	}
	public InsufficientBalanceException(String msg) 
	{
		this.msg=msg;
	}
	public String toString()
	{
		return "Amount withdrawable should be between 0 and Balance."+this.msg;
	}
}
class Balance
{
	int balance;
	public Balance()
	{
		this.balance=50000;
	}
	public Balance(int balance)
	{
		this.balance=balance;
	}
	public void Withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount>this.balance)
		{
			throw new InsufficientBalanceException ("Invalid Amount "+amount);
		}
		this.balance=amount;
		System.out.println(balance);
	}
}
public class ExceptionUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balance b1=new Balance();
		Balance b2=new Balance();
		try
		{
			b1.Withdraw(60000);
			b2.Withdraw(40000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
