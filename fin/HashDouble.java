public class HashDouble
{
	public static void main(String[] args)
	{
		HashTable myTable = new HashTable(13);

		myTable.insert(3);
		myTable.insert(5);
		myTable.insert(1);
		myTable.insert(37);
		myTable.insert(87);

		myTable.display();

		System.out.println("37: " + myTable.find(37));
		System.out.println("41: " + myTable.find(41));

		myTable.delete(5);
		myTable.display();
	}
	public static class DataItem
	{
		private int key;

		public DataItem(int key)
		{
			this.key = key;
		}

		public int getKey()
		{
			return key;
		}
	}

	public static class HashTable
	{
		private int maxSize;
		private DataItem[] hashArray;
		private DataItem nonItem;

		public HashTable(int size)
		{
			maxSize = size;
			hashArray = new DataItem[maxSize];
			nonItem = new DataItem(-1);
		}

		public int hashFunc (int key)
		{
			return (key % maxSize);
		}

  public int hashFunc2 (int key)
  {
   return (5 - key % 5);
  }

		public void insert(int n)
		{
			DataItem tmp = new DataItem(n);
			int hashVal = hashFunc(tmp.getKey());
   int stepSize = hashFunc2(tmp.getKey());

			while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1)
			{
				hashVal += stepSize;
				hashVal %= maxSize;
			}
			hashArray[hashVal] = tmp;
		}

		public DataItem find(int key)
		{
			int hashVal = hashFunc(key);
   int stepSize = hashFunc2(key);

			while (hashArray[hashVal] != null)
			{
				if (hashArray[hashVal].getKey() == key)
					return hashArray[hashVal];

				hashVal += stepSize;
				hashVal %= maxSize;
			}

			return null;
		}

		public DataItem delete(int key)
		{
			int hashVal = hashFunc(key);
   int stepSize = hashFunc2(key);

			while (hashArray[hashVal] != null)
			{
				if (hashArray[hashVal].getKey() == key)
				{
					DataItem tmp = hashArray[hashVal];
					hashArray[hashVal] = nonItem;
					return tmp;
				}

				hashVal += stepSize;
				hashVal %= maxSize;
			}
			return null;
		}

		public void display()
		{
			for (int i = 0; i < maxSize; i++)
			{
				if (hashArray[i] == null)
					System.out.println(i + ": null");
				else
					System.out.println(i + ": " + hashArray[i].getKey());
			}
		}
	}
}
