public class Simple
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 4, 2, 9, 3, 5, 8, 7, 6};

		System.out.println("Array Before Sort");
		printarr(arr);

		/*
		insertion(arr);
		System.out.println("Array After Insertion Sort");
		printarr(arr);

		bubble(arr);
		System.out.println("Array After Bubble Sort");
		printarr(arr);

		System.out.printf("3 position is: %d\n", BinarySearchIter(arr, 3));
		System.out.printf("9 position is: %d\n", BinarySearchIter(arr, 9));
		System.out.printf("15 position is: %d\n", BinarySearchIter(arr, 15));
		*/

		selection(arr);
		System.out.println("Array After selection Sort");
		printarr(arr);


		System.out.printf("3 position is: %d\n", BinarySearchRec(arr, 3));
		System.out.printf("9 position is: %d\n", BinarySearchRec(arr, 9));
		System.out.printf("15 position is: %d\n", BinarySearchRec(arr, 15));
	}

	public static void printarr(int[] arr)
	{
		System.out.println();
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("| %d ", arr[i]);
		}
		System.out.printf("|\n\n");
	}

	// like sorting cards, for each card look at the first placement left to it that is lesser than it and place it in front of it
	public static void insertion(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			int j = i - 1;
			int tmp = arr[i];

			while (j >= 0 && arr[j] > tmp)
			{
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = tmp;
		}
	}

	// compare each two elements and swap them to get the maximum value at the end of the unsorted part
	public static void bubble(int[] arr)
	{
		for (int i = arr.length - 1; i >= 0; i--)
		{
			boolean swapped = false;
			for (int j = 0; j < i; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					swapped = true;
				}
			}
			if (!swapped) break;
		}
	}

	// Select the minimum value of each iteration and put it at the head of the unsorted part
	public static void selection(int[] arr)
	{
		int tmp, minId;
		for (int i = 0; i < arr.length - 1; i++)
		{
			minId = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[minId])
					minId = j;
			}
			tmp = arr[i];
			arr[i] = arr[minId];
			arr[minId] = tmp;
		}
	}
	public static int BinarySearchIter(int[] arr, int key)
	{
		int leftId, rightId, midId;
		leftId = 0;
		rightId = arr.length - 1;

		while (leftId <= rightId)
		{
			midId = (leftId + rightId) / 2;
			if (arr[midId] == key)
				return midId;
			if (key > arr[midId])
			{
				leftId = midId + 1;
			}
			else
			{
				rightId = midId - 1;
			}
		}
		return -1;
	}

	public static int BinarySearchRec(int [] arr, int key)
	{
		return BinarySearchRec(arr, key, 0, arr.length - 1);
	}
	public static int BinarySearchRec(int[] arr, int key, int leftId, int rightId)
	{
		if (leftId > rightId)
			return -1;

		int midId = (leftId + rightId) / 2;

		if (arr[midId] == key)
			return midId;
		if (key > arr[midId])
			return BinarySearchRec(arr, key, midId + 1, rightId);
		else
			return BinarySearchRec(arr, key, leftId, midId - 1);
	}
}
