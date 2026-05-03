import java.util.Scanner;

public class Tictac
{
	public static void main(String[] args)
	{
		game tic = new game();
		tic.printboard();
		tic.start();
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

		public void start()
		{
			emptyboard();
			p1 = false;
			int p = p1? 1 : 2;

			while(true)
			{
				turn();
				printboard();
				if (checkwin())
				{
					System.out.printf("Player%d's WIN\n", p);
					return;
				}
				/*
				if (checkdraw());
				{
					System.out.println("DRAW");
					return;
				}
				*/
			}
		}

		public boolean checkwin()
		{
			for (int i = 0; i < 3; i++)
			{
				if (board[i][0] != '?' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
					return true;
				if (board[0][i] != '?' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
					return true;
			}
			if (board[0][0] != '?' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
				return true;
			if (board[0][2] != '?' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
				return true;
			return false;
		}

		public boolean checkdraw()
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
					if (board[i][j] == '?')
					{
						return false;
					}
			}
			return true;
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
