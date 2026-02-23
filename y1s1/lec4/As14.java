import java.util.Scanner;

public class As14 {
	public static void main(String[] args)
	{
		int x;
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter a number to check%n");
		x = input.nextInt();
		if (x % 2 == 1)
			System.out.printf("%d is odd%n", x);
		else
			System.out.printf("%d is even%n", x);
	}
}
