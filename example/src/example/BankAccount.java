package example;

/**
 * This is the BankAccount class
 * @author Joel
 * @version 1.0
 *
 */

public class BankAccount
{

	String name, acctNo;
	float balance;
	/**
	 * This is a parameterized constructor 
	 * @param name is the name of the account holder
	 * @param acctNo is the account no of the customer
	 * @param balance is the balance available in the account
	 */
	public BankAccount(String name, String acctNo, float balance)
	{
		this.name = name;
		this.acctNo = acctNo;
		this.balance = balance;
	}
	/**
	 * This is a method to deposit money
	 * @param Deposit is the amount to be deposited
	 * @return returns the balance
	 */
	public int Deposit(int Deposit)
	{
		return (int) (balance = balance + Deposit);
	}
	/**
	 * 
	 * @param withdrawAmt is the amount to be withdrawn
	 * @return
	 */
	public int Withdraw(int withdrawAmt)
	{
		if(withdrawAmt > balance)
		{
			System.out.println("Insufficient Balance.");
		}
		else
		{
			balance = balance - withdrawAmt;
		}
		return (int) balance;
	}
	/**
	 * this is the display method
	 */
	public void getBalance()
	{
		System.out.println("-------------------------------");
		System.out.println("Account Details: ");
		System.out.println("Account Number: " +acctNo);
		System.out.println("Balance: " +balance);
		System.out.println("-------------------------------");
	}
	
	public float getb()
	{
		return balance;
	}
	
	public static void main(String args[])
	{
	}
}

