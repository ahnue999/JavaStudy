public class Rec
{
	public static void main(String[] args)
	{
		tlist(5);
	}
	public static int tri(int n)
	{
		if (n == 1)
		{
			return (1);
		}
		return(n + tri(n-1));
	}

	public static void tlist(int n)
	{
		System.out.println(tri(n));
		if (n <= 1) return;
		tlist(n - 1);
	}
}
