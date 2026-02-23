import java.util.Scanner;

public class As15 {
	public static void main(String[] args)
	{
		int x, y;
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter a number%n");
		x = input.nextInt();
		System.out.printf("Enter a number%n");
		y = input.nextInt();

		if (x % y == 0)
			System.out.printf("%d is multiple of %d%n", x, y);
		else
			System.out.printf("%d is NOT a multiple of %d%n", x, y);
	}
}
