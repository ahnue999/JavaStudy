public class Stack
{
	public static void main(String[] args)
	{
		MyStack stk = new MyStack(20);

		stk.push(4);
		stk.push(1);
		stk.push(9);
		stk.push(10);
		stk.push(10);

		stk.display();

		System.out.println("After pop:");

		stk.pop();

		stk.display();
	}

	public static class MyStack
	{
		private int[] StackArray;
		private int maxSize;
		private int top;

		public MyStack(int size)
		{
			maxSize = size;
			StackArray = new int[maxSize];
			top = -1;
		}

		public void push(int n)
		{
			if (isFull()) return;
			StackArray[++top] = n;
		}

		public int pop()
		{
			if (isEmpty()) return -1;
			return (StackArray[top--]);
		}

		public int peek()
		{
			if (isEmpty()) return -1;
			return (StackArray[top]);
		}

		public boolean isEmpty()
		{
			return (top == -1);
		}
		public boolean isFull()
		{
			return (top == maxSize -1);
		}

		public void display()
		{
			for (int i = top; i >= 0; i--)
			{
				System.out.println(StackArray[i] + " ");
			}
		}
	}
}
