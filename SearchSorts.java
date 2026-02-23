import java.util.Scanner;

public class SearchSorts
{
	public static void main(String[] args)
	{
		int max = 100;
		arrays arr = new arrays(max);

		arr.insert(2);
		arr.insert(8);
		arr.insert(4);
		arr.insert(1);
		arr.insert(3);
		arr.insert(7);
		arr.insert(9);
		arr.insert(6);
		arr.insert(5);

		arr.display();

		//arr.bubbleSort();
		//arr.selectionSort();
		arr.insertionSort();

		System.out.println("After Sort:");
		arr.display();
		/*
		 * Search test
		System.out.println("item 3: " + arr.binarySearch(3));
		System.out.println("item 2: " + arr.binarySearch(2));
		System.out.println("item 15: " + arr.binarySearch(15));
		*/

	}
	public static class arrays
	{
		private int[] A;
		private int s;

		public arrays(int max)
		{
			s = 0;
			A = new int[max];
		}

		public void insert(int value)
		{
				A[s] = value;
				s++;
		}

		// For quick testing
		public void fillstatic()
		{
			int[] B = {1, 3, 4, 2, 6, 7, 10, 11, 22, 25};
			A = B;
			s = 0;
		}

		public void display()
		{
			for (int i = 0; i < s; i++)
			{
				System.out.print(A[i] + " ");
			}
			System.out.println();
		}

		public int linearSearch(int value)
		{
			for (int i = 0; i < s; i++)
			{
				if (A[i] == value)
					return (i);
			}
			return (-1);
		}

		public void swap(int n1, int n2)
		{
			int tmp;

			tmp = A[n1];
			A[n1] = A[n2];
			A[n2] = tmp;
		}

		public void bubbleSort()
		{
			// Compares each two elements and swaps them if they are not in order.
			for (int i = 0; i < s-1; i++)
			{
				for (int j = 0; j < s-1; j++)
				{
					if (A[j] > A[j + 1])
					{
						swap(j, j + 1);
					}
				}
			}
		}

		public void selectionSort()
		{
			// At each iteration; selects the minimum number and put it in the first index of the iteration
			int minIndex;

			for (int i = 0; i < s-1; i++)
			{
				minIndex = i;
				for (int j = i + 1; j < s; j++)
				{
					if (A[j] < A[minIndex])
						minIndex = j;
				}
				swap(i, minIndex);
			}
		}

		public void insertionSort()
		{
			/* starting from index one, we compare each member of the list and move them on step to the right
			if they are bigger than our refrence, until we hit a smaller number (the refrence moves to the left).
			*/

			int tmp;
			for (int i = 1; i < s; i++)
			{
				tmp = A[i];
				int j = i - 1;

				while (j >= 0 && A[j] > tmp)
				{
					A[j + 1] = A[j];
					j--;
				}
				A[j + 1] = tmp;
			}
		}

		public void binarySearch(int value)
		{

		}
	}
}
