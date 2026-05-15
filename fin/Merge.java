public class Merge
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 4, 2, 9, 3, 5, 8, 7, 6};

		System.out.println("Array Before Sort");
		printarr(arr);
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("Array After merge Sort");
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

	// Divide and conquer
	// Keep dividing the array till each section is a single element
	// Merge while taking order into account
	// So each section is a sorted array merged with another sorted array taking order into account
	// [5 4 8 3]
	// [5 4]  [8 3]
	// [5]  [4]  [8]  [3]
	// [4 5]  [3 8]
	// [3 4 5 8]
	public static void mergeSort(int[] arr, int left, int right)
	{
		if (left >= right)
			return;

		int mid = (left + right) / 2;

		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);

		merge(arr, left, mid, right);
	}
	public static void merge(int[] arr, int left, int mid, int right)
	{
		int n = right - left + 1;
		int[] tmp = new int[n];

		int i = left;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= right)
		{
			if (arr[i] <= arr[j])
			{
				tmp[k++] = arr[i++];
			}
			else
			{
				tmp[k++] = arr[j++];
			}
		}

		while (i <= mid)
		{
			tmp[k++] = arr[i++];
		}
		while (j <= right)
		{
			tmp[k++] = arr[j++];
		}

		for (k = 0; k < n; k++)
		{
			arr[left + k] = tmp[k];
		}
	}
}
