public class Part
{
  public static void main(String[] args) {
      int[] a = {1, 8, 3, 4, 6, 2, 5, 7};
      
      part(a);
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
	public static void swap(int[] arr, int a, int b)
	{
	  int tmp = arr[a];
	  arr[a] = arr[b];
	  arr[b] = tmp;
	}
  public static void part(int[] arr)
  {
    int left = -1;
    int right = arr.length;
    int piv = arr[arr.length / 2];
    
    while (true)
    {
      while (left < arr.length && arr[++left] < piv);
      while (right > 0 && arr[--right] > piv);
      
      if (left >= right)
      {
        break;
      }
      else 
      {
        swap(arr, left, right);
      }
      
    }
  }
}

