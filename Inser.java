public class Inser
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{4, 2, 5, 1, 8, 0};
		display(arr);
		shell(arr);
		display(arr);
		

	}
	public static void insertion(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			int tmp = arr[i];
			int j = i;
			while (j > 0 && tmp < arr[j - 1])
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = tmp;
		}
	}

	public static void shell(int[] arr)
	{
		int n = arr.length;

		int h = 1;
		while (h <= n/3)
			h = 3 * h + 1;

		while (h > 1)
		{
			for (int i = h; i < n; i++)
			{
				int tmp = arr[i];
				int j = i;
				while (j >= h && tmp < arr[i - h])
				{
					arr[j] = arr[j-h];
					j -= h;
				}
				arr[j] = tmp;
			}
			h = (h - 1) / 3;
		}
	}

	public static void display(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
}
