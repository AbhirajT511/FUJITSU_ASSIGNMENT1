class SavingsAccount
{
	double balance;
	double interest;
	public SavingsAccount(double balance, double interest)
	{
		super();
		this.balance=balance;
		this.interest=interest;
	}
	void withDraw(int amount)
	{
		balance = balance - amount;
	}
	void deposit(int amount)
	{
		balance = balance + amount;
	}
	void addInterest()
	{
		double intr = balance * interest/100;
		balance = balance + intr;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		double intr = balance * interest/100;
		balance = balance + intr;
		return balance;
	}
	
}
public class TestBankApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SavingsAccount s1 = new SavingsAccount(1500.0, 5.0);
		s1.deposit(200);
		System.out.println(s1.getBalance());
		s1.withDraw(100);
		System.out.println(s1.getBalance());
	}

}
