public class Recursion
{
	public static void main(String[] args)
	{
		System.out.println("fact of 5: " + fact(5));
		System.out.println("fact of 0: " + fact(0));

		System.out.println("fib of 6: " + fib(6));

		fibSeries(6);
	}
	public static int fact(int n)
	{
		if (n <= 1)
			return 1;

		return (n * fact(n - 1));
	}
	public static int fib(int n)
	{
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fib(n - 1) + fib(n - 2);
	}

	public static void fibSeries(int n)
	{
		if (n < 0)
			return;

		fibSeries(n - 1);
		System.out.printf("%d ", fib(n));
	}
}
