public class CircularQueues
{
	public static void main(String[] args)
	{
		QueuesArr myQueue = new QueuesArr(10);

		myQueue.insert(1);
		myQueue.insert(3);
		myQueue.insert(5);
		myQueue.insert(8);
		myQueue.insert(7);

		myQueue.display();

		myQueue.remove();
		myQueue.remove();

		myQueue.display();

		System.out.printf("Peek: %d\n", myQueue.peek());
	}
	public static class QueuesArr
	{
		private final int maxSize;
		private int[] queueArray;
		private int front;
		private int rear;
		private int nElems;

		public QueuesArr(int max)
		{
			maxSize = max;
			queueArray = new int[maxSize];
			front = 0;
			rear = -1;
			nElems = 0;
		}

		public boolean isEmpty()
		{ return (nElems == 0);
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
			if (rear == maxSize - 1)
				rear = -1;
			queueArray[++rear] = n;
			nElems++;
		}
		public int remove()
		{
			if (isEmpty())
			{
				System.out.println("Queue is empty");
				return (-1);
			}
			nElems --;
			int tmp =  queueArray[front++];

			if (front == maxSize)
				front = 0;
			return tmp;
		}
		public int peek()
		{
			if (isEmpty())
			{
				System.out.println("Queue underflow");
				return (-1);
			}
			return (queueArray[front]);
		}

		public int size()
		{
			return nElems;
		}

		public void display()
		{
			int n = front;

			for (int i = 0; i < nElems; i++)
			{
				System.out.printf("%d  ", queueArray[n]);
				n++;

				if (n == maxSize)
					n = 0;
			}
			System.out.println();
		}
	}
}
