import java.util.Scanner;

public class Ex16_14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String sentence;
		String[] words;

		System.out.println("Enter a line");
		sentence = input.nextLine();
		words = sentence.split(" ");

		for (String word : words)
		{
			if (word.toLowerCase().endsWith("ed"))
				System.out.println(word);
		}
	}
}
