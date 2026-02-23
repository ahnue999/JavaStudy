import java.util.Scanner;

public class Ex16_12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String sentence;
		char toFind;
		int c;
		int[][] dict = new int[26][2];

		System.out.println("Enter a line to search in");
		sentence = input.nextLine();

		for (int i = 0; i <= 25; i++)
		{
			c = i + 65;
			dict[i][0] = c;
			dict[i][1] += countChar(sentence.toUpperCase(), (char) c);
		}

		tabular(dict);
	}
	public static int countChar(String sentence, char toFind)
	{
		int startingPoint = 0;
		int count = 0;

		startingPoint = sentence.indexOf(toFind, startingPoint);

		while (startingPoint != -1)
		{
			count++;
			startingPoint = sentence.indexOf(toFind, startingPoint + 1);
		}

		//System.out.printf("%c was found %d times\n", toFind, count);
		return (count);
	}

	public static void tabular(int[][] arr)
	{
		for (int[] letter : arr)
		{
			System.out.printf("%c: ", letter[0]);
			for (int i = 0; i < letter[1]; i++)
				System.out.printf("*");
			System.out.printf("\n");
		}
	}
}
