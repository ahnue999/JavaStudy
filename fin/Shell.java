public class Shell
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 4, 2, 9, 3, 5, 8, 7, 6};

		System.out.println("Array Before Sort");
		printarr(arr);
		shell(arr);
		System.out.println("Array After Shell Sort");
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

	public static void shell(int[] arr)
	{
		int n = arr.length;

		for (int h = n / 2; h > 0; h /= 2)
		{

			for (int i = h; i < n; i++)
			{
				int j = i;
				int tmp = arr[i];

				while (j >= 0 && tmp < arr[j])
				{
					arr[j+h] = arr[j];
					j -=h;
				}
				arr[j+h] = tmp;
			}
		}
	}
}
