import java.util.Scanner;

public class Ex16_17
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String word;

		System.out.println("Enter a 5 letter word");
		word = input.nextLine();

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				for (int k = 0; k < 5; k++)
				{
					if (i != j && i != k && j != k)
						System.out.printf("%c%c%c%n", word.charAt(i), word.charAt(j), word.charAt(k));
				}
			}
		}
	}
}
