import java.lang.Math;
import java.util.Scanner;

public class Distance
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x1; int y1;
		int x2; int y2;
		double d;

		System.out.println("Enter x & y for point 1");
		x1 = input.nextInt();
		y1 = input.nextInt();
		System.out.println("Enter x & y for point 2");
		x2 = input.nextInt();
		y2 = input.nextInt();

		d = distance(x1, y1, x2, y2);
		System.out.printf("The distance between (%d, %d) and (%d, %d) is: %.2f%n", x1, y1, x2, y2, d);
	}

	public static double distance(int x1, int y1, int x2, int y2)
	{
		double d;

		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return (d);
	}
}
