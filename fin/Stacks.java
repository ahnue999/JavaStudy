public class Stacks
{
	public static void main(String[] args)
	{
		StackArr myStack = new StackArr(10);

		myStack.push('B');
		myStack.push('e');
		myStack.push('a');
		myStack.push('k');
		myStack.push('o');
		myStack.display();

		myStack.pop();
		myStack.pop();
		myStack.display();

		System.out.printf("Peek: %c\n", myStack.peek());
	}
	public static class StackArr
	{
		private int maxSize;
		private char[] stackArray;
		private int top;

		public StackArr(int max)
		{
			maxSize = max;
			stackArray = new char[maxSize];
			top = -1;
		}

		public boolean isEmpty()
		{
			return (top == -1);
		}
		public boolean isFull()
		{
			return (top == maxSize - 1);
		}
		public void push(char c)
		{
			if (isFull())
			{
				System.out.println("Stack overflow");
				return;
			}
			stackArray[++top] = c;
		}
		public char pop()
		{
			if (isEmpty())
			{
				System.out.println("Stack underflow");
				return ('\0');
			}
			return stackArray[top--];
		}
		public char peek()
		{
			if (isEmpty())
			{
				System.out.println("Stack underflow");
				return ('\0');
			}
			return stackArray[top];
		}
		public void dispaly()
		{
			System.out.printf("Stack:\n_________\n");
			for (int i = top; i >= 0; i--)
			{
				System.out.println(i + " | " + stackArray[i]);
			}
			System.out.printf("_________\n");
		}
	}
}
