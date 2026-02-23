import java.util.Scanner;

public class Ex16_10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String sentence;

		System.out.println("Enter a line");
		sentence = input.nextLine();

		System.out.printf("%s\n", sentence.toUpperCase());
		System.out.printf("%s\n", sentence.toLowerCase());
	}
}
