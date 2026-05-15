public class Quick
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 4, 2, 9, 3, 5, 8, 7, 6};

		System.out.println("Array Before Sort");
		printarr(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Array After Quick Sort");
		printarr(arr);
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

	public static void quickSort(int[] arr, int left, int right)
	{
		if (left >= right)
			return;

		int pivot = arr[left];
		int i = left + 1;
		int j = right;

		while (true)
		{
			while (i <= j && arr[i] < pivot) i++;
			while (arr[j] > pivot) j--;

			if (i >= j)
				break;

			swap(arr, i, j);
		}
		swap (arr, left, j);

		quickSort(arr, left, j - 1);
		quickSort(arr, j + 1, right);
	}

	public static void swap(int[] arr, int a, int b)
	{
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
