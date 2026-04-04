public class MergeSort
{
	public static void main(String[] args)
	{
		int[] arr = {9, 3, 5, 1, 8, 2, 10, 11, 20};

		int[] sorted = mergeSort(arr);

		display(sorted);
	}

	public static void display(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}

	public static int[] merge(int[] a, int[] b)
	{
		int sizeA = a.length;
		int sizeB = b.length;
		int[] r = new int[sizeA + sizeB];
		int aDex, bDex, rDex;
		aDex = bDex = rDex = 0;

		while (aDex < sizeA && bDex < sizeB)
		{
			if (a[aDex] < b[bDex])
			{
				r[rDex++] = a[aDex++];
			}
			else
			{
				r[rDex++] = b[bDex++];
			}
		}

		while (aDex < sizeA)
		{
			r[rDex++] = a[aDex++];
		}
		while (bDex < sizeB)
		{
			r[rDex++] = b[bDex++];
		}

		return(r);
	}

	public static int[] mergeSort(int[] arr)
	{
		if (arr.length == 1) return arr;

		int mid = arr.length / 2;

		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		for (int i = 0; i < mid; i++)
		{
			left[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++)
		{
			right[i - mid] = arr[i];
		}

		left = mergeSort(left);
		right = mergeSort(right);

		return (merge(left, right));
	}
}
