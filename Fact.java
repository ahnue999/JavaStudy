public class Fact
{
	public static void main(String[] args)
	{
		System.out.println("Fact 1: " + fact(1));
		System.out.println("Fact 3: " + fact(3));
		System.out.println("Fact 5: " + fact(5));
	}
	public static int fact(int n)
	{
		if (n == 0)
			return 1;
		return (n * fact(n-1));
	}
}
