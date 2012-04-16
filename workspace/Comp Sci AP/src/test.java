interface account
{
	//variables are final and static
	public String bankName = "Bank of ABC";
	
	//methods are empty
	public double getBalance();
	public void withdraw(double money);
	public void deposit(double money);	
}

class checkingAccount implements account
{
	public double balance;
	
	/**
	 * Constructor
	 * @param newBalance
	 */
	public checkingAccount(double newBalance)
	{
		balance = newBalance;
	}
	
	/**
	 * get balance
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * @param money withdraw money to bank account
	 */
	public void withdraw(double money)
	{
		//withdraw
	}
	
	/**
	 * @param money deposit money to bank account
	 */
	public void deposit(double money)
	{
		//deposit
	}
	
}

public class test
{
	
	public static void main(String args[])
	{
		//create checkingAccount obj
		checkingAccount obj = new checkingAccount(100.25);
		
		
		//print bankName and get Balance
		System.out.println(obj.bankName);
		System.out.println(obj.getBalance());
	}
}