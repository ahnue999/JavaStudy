public class MergeSort
{
	public static void main(String[] args)
	{
		int[] a = {1, 3 ,5, 9};
		int[] b = {2, 8 ,10, 11, 20};

		display(merge(a, b));
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
}
