public class PrimeNumbers
{
	public static void main(String[] args)
	{
		int size = 10000;
		int perLine = 18;
		int count = 0;

		System.out.printf("\n\t");
		for (int i = 0; i < size; i++)
		{
			if (isPrime(i))
			{
				count++;
				System.out.printf("| %4d ", i);

				if (count == perLine)
				{
					System.out.printf("|%n\t");
					count = 0;
				}
			}
		}
		System.out.printf("\n");
	}
	public static Boolean isPrime(int num)
	{
		for (int i = 2; i <= num/2; i++)
		{
			if (num % i == 0)
			{
				return (false);
			}
		}
		return (true);
	}
}
