public class BinarySearch
{
	public static void main(String[] args)
	{
		//int[] a = {3, 5, 7, 2, 1, 4, 9};
		int[] a = {1, 2, 3, 4, 5, 7, 9};

		display(a);

		System.out.println("3 index: " + binSearch(a, 3));
		System.out.println("2 index: " + binSearch(a, 2));
		System.out.println("8 index: " + binSearch(a, 8));
		System.out.println("9 index: " + binSearch(a, 9));
	}
	
	public static void display(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}

	public static int binSearch(int[] arr, int key)
	{
		int left = 0;
		int right = arr.length - 1;

		while (left <= right)
		{
			int mid = (left + right) / 2;

			if (arr[mid] == key)
			{
				return mid;
			}
			else if (arr[mid] < key)
			{
				left = mid + 1;
			}
			else 
			{
				right = mid - 1;
			}
		}
		return -1;
	}
}
