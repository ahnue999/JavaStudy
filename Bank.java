public class Bank
{
	public static class BankAccount
	{
		private String accountNumber;
		private double balance;

		public BankAccount(String an, double balance)
		{
			accountNumber = an;
			this.balance = balance;
		}

		public BankAccount(String an)
		{
			accountNumber = an;
			balance = 0;
		}

		public void withdraw(double amount)
		{
			System.out.println("Attempting to Withdraw: " + amount);
			if (amount <= 0)
			{
				System.out.println("Please enter a valid amount");
				return;
			}

			if (amount > balance)
			{
				System.out.println("Error: insufficient balance");
				return;
			}

			balance -= amount;
			System.out.println("Withdrawal Successful, Available balance: " + balance);
		}
		public void deposit(double amount)
		{
			System.out.println("Attempting to Deposit: " + amount);
			if (amount <= 0)
			{
				System.out.println("Please enter a valid amount");
				return;
			}
			balance += amount;
			System.out.println("Deposit Successful, Available balance: " + balance);
		}

		public void displayBalance()
		{
			System.out.println("Current Balance: " + balance);
		}
	}

	public static class Customer
	{
		private int id;
		private String name;
		private BankAccount acc;

		public Customer(int id, String name, String accountNumber, double balance)
		{
			this.id = id;
			this.name = name;
			acc = new BankAccount(accountNumber, balance);
		}

		public void withdraw(double amount)
		{
			acc.withdraw(amount);
		}

		public void deposit(double amount)
		{
			acc.deposit(amount);
		}

		public void displayBalance()
		{
			acc.displayBalance();
		}
	}

	public static void main(String[] args)
	{
		Customer c1 = new Customer(37, "Ali", "62107737", 3000);

		c1.displayBalance();
		c1.deposit(500);
		c1.withdraw(2000);
		c1.withdraw(10000);
		c1.displayBalance();
	}
}
