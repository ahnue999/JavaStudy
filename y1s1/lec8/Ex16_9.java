import java.util.Scanner;

public class Ex16_9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String sentence;
		String[] words;

		System.out.println("Enter a line to reverse");
		sentence = input.nextLine();
		words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--)
			System.out.printf("%s ", words[i]);
		System.out.printf("\n");
	}
}
