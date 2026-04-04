public class Insertion
{
    public static void main(String[] args) {
      int[] a = {1, 3, 2, 6, 4, 5, 7};
      
      insertion(a);
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
    public static void insertion(int[] arr)
    {
      for (int i = 1; i < arr.length; i++)
      {
        int tmp = arr[i];
        int j = i - 1;
        
        while (j >= 0 && tmp < arr[j])
        {
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = tmp;
      }
    }
}
