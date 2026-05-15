public class Queues
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
		private int maxSize;
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
			return queueArray[front++];
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
		public void display()
		{
			for (int i = front; i <= rear; i++)
			{
				System.out.printf("%d  ", queueArray[i]);
			}
			System.out.println("");
		}
	}
}
