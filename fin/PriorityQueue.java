public class PriorityQueue
{
	public static void main(String[] args)
	{
		PriorityQ myQueue = new PriorityQ(10);

		myQueue.insert(1);
		myQueue.insert(5);
		myQueue.insert(2);
		myQueue.insert(4);
		myQueue.insert(3);

		myQueue.remove();
		myQueue.display();

		System.out.printf("Peek min: %d\n", myQueue.peekMin());
	}
	public static class PriorityQ
	{
		private final int maxSize;
		private int[] queueArray;
		private int nElems;

		public PriorityQ(int max)
		{
			maxSize = max;
			queueArray = new int[maxSize];
			nElems = 0;
		}

		public boolean isEmpty()
		{
			return (nElems == 0);
		}
		public boolean isFull()
		{
			return (nElems == maxSize);
		}

		public void insert(int n)
		{
			if (isFull())
			{
				System.out.println("Queue overflow");
				return;
			}

			if (nElems == 0)
			{
				queueArray[nElems++] = n;
				return;
			}

			int i = nElems - 1;

			while (i >= 0 && n > queueArray[i])
			{
				queueArray[i + 1] = queueArray[i];
				i--;
			}
			queueArray[i + 1] = n;
			nElems++;
		}

		public int remove()
		{
			if (isEmpty())
			{
				System.out.println("Queue underflow");
				return (-1);
			}

			return (queueArray[--nElems]);
		}

		public int peekMin()
		{
			if (isEmpty())
			{
				System.out.println("Queue is Empty");
				return (-1);
			}

			return (queueArray[nElems - 1]);
		}

		public void display()
		{
			for (int i = 0; i < nElems; i++)
			{
				System.out.printf("%d ", queueArray[i]);
			}
			System.out.println();
		}
	}
}
