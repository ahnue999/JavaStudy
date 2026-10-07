import java.util.Scanner;

public class BankIntractive
{
	public static class BankAccount
	{
		private String accountNumber;
		private int balance;

		BankAccount(String an, int balance)
		{
			accountNumber = an;
			this.balance = balance;
		}

		BankAccount(String an)
		{
			accountNumber = an;
			balance = 0;
		}

		public void withdraw(int amount)
		{
			System.out.println("Attempting to Withdraw: " + amount + "...");
			if (amount < 0)
			{
				System.out.println("Please enter a valid amoont");
				return;
			}

			if (amount > balance)
			{
				System.out.println("Error: insufficient credit");
				return;
			}

			balance -= amount;
			System.out.println("Withdrawal Succesful, Available balance: " + balance);
		}
		public void deposit(int amount)
		{
			if (amount < 0)
			{
				System.out.println("Please enter a valid amount");
				return;
			}
			balance += amount;
		}

		public void displayBalance()
		{
			System.out.println("Current Balance: " + balance);
		}
	}

	public static class Customer
	{
		private int ID;
		private String name;
		public BankAccount acc;

		Customer(int ID, String name, String accountNumber, int balance)
		{
			this.ID = ID;
			this.name = name;
			acc = new BankAccount(accountNumber, balance);
		}

		public void withdraw(int amount)
		{
			acc.withdraw(amount);
		}

		public void deposit(int amount)
		{
			acc.deposit(amount);
		}

		public void displayBalance()
		{
			acc.displayBalance();
		}
	}

	public void addAccount()
	{
	}

	public static void main(String[] args)
	{
		Customer c1 = new Customer(37, "Ali", "62107737", 3000);

		Scanner input = new Scanner(System.in);
		int c;

		while (true)
		{
			c = input.nextInt();

			switch(c)
			{
				case 1:
					addAccount();
			}
		}
	}
}
