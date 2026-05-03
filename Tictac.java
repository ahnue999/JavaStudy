import java.util.Scanner;

public class Tictac
{
	public static void main(String[] args)
	{
		Game tic = new Game();
		tic.menu();
	}
	public static class Game
	{
		private char[][] board;
		boolean p1;
		Scanner input = new Scanner(System.in);

		public Game()
		{
			board = new char[3][3];
			emptyboard();
			p1 = true;
		}

		public void menu()
		{
			int c;

			while (true)
			{
				System.out.printf("[1] Start Game\n[2] Exit\n");
				if (!input.hasNextInt())
				{
					System.out.println("Please Enter a Number from Range (1-2)");
					input.next();
					continue;
				}
				c = input.nextInt();

				switch (c)
				{
					case 1:
						start();
						break;
					case 2:
						System.out.println("See You Next Time!");
						return;
					default:
						System.out.println("Enter a Valid Value [1-2]");
				}
			}
		}
		public void start()
		{
			emptyboard();
			p1 = true;

			printboard();
			while(true)
			{
				char p = symbol();
				turn();
				printboard();
				if (checkwin())
				{
					System.out.printf("%c WINS\n\n", p);
					return;
				}
				
				if (checkdraw())
				{
					System.out.printf("DRAW\n\n");
					return;
				}
			}
		}

		public boolean checkwin()
		{
			for (int i = 0; i < 3; i++)
			{
				if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
					return true;
				if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
					return true;
			}
			if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
				return true;
			if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
				return true;
			return false;
		}

		public boolean checkdraw()
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
					if (board[i][j] == ' ')
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
					board[i][j] = ' ';
				}
			}
		}
		public void printboard()
		{
			clrscr();
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
					System.out.println("---+---+---");
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
			return (new int[] {n / 3, n % 3});
		}

		public void turn()
		{
			char p = symbol();
			int[] pos = new int[2];
			System.out.printf("%c's move (1-9)\n", p);

			while(true)
			{
				if (!input.hasNextInt())
				{
					System.out.println("INVALID INPUT: Please Enter a Number from Range (1-9)");
					input.next();
					continue;
				}
				pos = conv(input.nextInt());

				try
				{
					if (board[pos[0]][pos[1]] != ' ')
						throw new IllegalArgumentException("");
					board[pos[0]][pos[1]] = symbol();
					p1 = !p1;
					return;
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println("OUT OF BOUNDS: Please Enter a Number from Range (1-9)");
				}
				catch (IllegalArgumentException e)
				{
					System.out.println("POSITION LOCKED: Please Pick Another Position");
				}
			}
		}

		public void clrscr()
		{
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
	}
}
