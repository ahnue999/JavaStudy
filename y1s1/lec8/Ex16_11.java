import java.util.Scanner;

public class Ex16_11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String sentence;
		int startingPoint = 0;
		int count = 0;
		char toFind;

		System.out.println("Enter a line to search in");
		sentence = input.nextLine();
		System.out.println("Enter a character to find");
		toFind = input.next().charAt(0);

		startingPoint = sentence.indexOf(toFind, startingPoint);

		while (startingPoint != -1)
		{
			count++;
			startingPoint = sentence.indexOf(toFind, startingPoint + 1);
		}

		System.out.printf("%c was found %d times\n", toFind, count);
	}
}
