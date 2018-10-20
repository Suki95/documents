public class Account 
{
	private long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() 
	{
		return accNum;
	}
	public void setAccNum(long accNum) 
	{
		this.accNum = accNum;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public Person getAccHolder() 
	{
		return accHolder;
	}
	public void setAccHolder(Person accHolder) 
	{
		this.accHolder = accHolder;
	}
	public Account(long accNum, double balance, Person accHolder) 
	{
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public Account() 
	{
		super();
	}
	@Override
	public String toString() 
	{
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	public void deposit(double dep)
	{
		Account acc=new Account();
	}
}
