import java.util.Scanner;

public class Ex5
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int n, d;

		System.out.println("Enter the numerator");
		n = input.nextInt();
		System.out.println("Enter the denominator");
		d = input.nextInt();

		Rational rat = new Rational(n, d);

		System.out.printf("The double form is: %.4f", rat.getDbl());
	}
	public static class Rational
	{
		int num, den;
		double dbl;

		public Rational(int n, int d)
		{
			num = n;
			den = d;
		}

		public double getDbl()
		{
			dbl = (double) this.num / this.den;
			return (dbl);
		}
	}
}
