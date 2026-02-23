import java.util.Scanner;

public class Ex16_15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int ascii;

		System.out.println("Enter Ascii code (0-255)");
		ascii = input.nextInt();

		if (ascii >= 0 && ascii <= 255)
			System.out.printf("%c\n", ascii);
		else
			System.out.println("Unknown code");
	}
}
