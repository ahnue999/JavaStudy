import java.util.Scanner;

public class Tictac
{
	public static void main(String[] args)
	{
		game tic = new game();
		tic.turn();
		tic.turn();
		tic.printboard();
	}
	public static class game
	{
		private char[][] board;
		boolean p1;
		Scanner input = new Scanner(System.in);

		public game()
		{
			board = new char[3][3];
			emptyboard();
			p1 = false;
		}

		public void emptyboard()
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					board[i][j] = '?';
				}
			}
		}
		public void printboard()
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(" " + board[i][j]);
					if (j != 2)
						System.out.print(" |");
				}
				if (i != 2)
				{
					System.out.println();
					System.out.println("---.---.---");
				}
			}
			System.out.println();
		}
		public char symbol()
		{
			if (p1)
				return ('O');
			return ('X');
		}
		public int[] conv(int n)
		{
			n--;
			int i = 0;
			while (n > 2)
			{
				n -= 3;
				i++;
			}
			return (new int[] {i, n});
		}

		public void turn()
		{
			p1 = !p1;
			int p = p1? 1: 2;
			int[] pos = new int[2];
			System.out.printf("Player%d's move (1-9)\n", p);

			while(true)
			{
				pos = conv(input.nextInt());
				try
				{
					if (board[pos[0]][pos[1]] != '?')
						throw new IllegalArgumentException("");
					board[pos[0]][pos[1]] = symbol();
					return;
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Please Enter a Valid Move");
				}
				catch (IllegalArgumentException e)
				{
					System.out.println("Please Enter a Valid Move");
				}
			}
		}
	}
}
