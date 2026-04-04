public class RecBinarySearch
{
	public static void main(String[] args)
	{
		//int[] a = {3, 5, 7, 2, 1, 4, 9};
		int[] a = {1, 2, 3, 4, 5, 7, 9};

		display(a);

		System.out.println("3 index: " + binSearch(a, 3, 0, a.length));
		System.out.println("2 index: " + binSearch(a, 2, 0, a.length));
		System.out.println("8 index: " + binSearch(a, 8, 0, a.length));
		System.out.println("9 index: " + binSearch(a, 9, 0, a.length));
	}
	
	public static void display(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}

	public static int binSearch(int[] arr, int key, int left, int right)
	{
		if (left > right)
		{
			return -1;
		}

		int mid = (left + right) / 2;

		if (key == arr[mid])
		{
			return mid;
		}
		else if (key > arr[mid])
		{
			return(binSearch(arr, key, mid + 1, right));
		}
		else
		{
			return(binSearch(arr, key, left, right - 1));
		}
	}
}
