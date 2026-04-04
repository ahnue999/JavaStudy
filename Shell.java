public class Shell
{
  public static void main(String[] args) {
      int[] a = {1, 3, 2, 6, 4, 5, 7};
      
      shell(a);
      display(a);
    }
	public static void display(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}
  public static void shell(int[] arr)
  {
    int gap = 1;
    while (gap < arr.length / 3)
    {
      gap = 3 * gap + 1;
    }
    
    while (gap >= 1)
    {
      for (int i = gap; i < arr.length; i++)
      {
        int tmp = arr[i];
        int j = i;
        
        while (j >= gap && tmp < arr[j - gap])
        {
          arr[j] = arr[j - gap];
          j -= gap;
        }
        arr[j] = tmp;
      }
      gap /= 3;
    }
  }
}

