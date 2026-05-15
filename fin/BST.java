public class BST
{
	public static void main(String[] args)
	{
		BinarySearchTree myBST = new BinarySearchTree();

		myBST.insert(4);
		myBST.insert(2);
		myBST.insert(1);
		myBST.insert(7);
		myBST.insert(3);
		myBST.insert(5);

		System.out.println("\ninOrder:");
		myBST.inOrder(myBST.top);
		System.out.println("\npreOrder:");
		myBST.preOrder(myBST.top);
		System.out.println("\npostOrder:");
		myBST.postOrder(myBST.top);

		System.out.println("Find 5: " + myBST.find(5));
		System.out.println("Find 9: " + myBST.find(9));
	}
	public static class Node
	{
		public int data;
		public Node left;
		public Node right;

		public Node(int n)
		{
			data = n;
			left = right = null;
		}
	}

	public static class BinarySearchTree
	{
		Node top;

		public boolean isEmpty()
		{
			return (top == null);
		}

		public void insert(int n)
		{
			Node tmp = new Node(n);

			if (isEmpty())
			{
				top = tmp;
				return;
			}

			Node curr = top;
			Node parent = null;

			while (true)
			{
				parent = curr;
				if (n < curr.data)
				{
					curr = curr.left;
					if (curr == null)
					{
						parent.left = tmp;
						return;
					}
				}
				else
				{
					curr = curr.right;
					if (curr == null)
					{
						parent.right = tmp;
						return;
					}
				}
			}
		}

		public Node find(int key)
		{
			Node curr = top;

			while (curr != null && curr.data != key)
			{
				if (key < curr.data)
					curr = curr.left;
				else
					curr = curr.right;
			}

			return curr;
		}

		public void inOrder(Node top)
		{
			if (top == null)
				return;

			inOrder(top.left);
			System.out.printf("%d ", top.data);
			inOrder(top.right);
		}
		public void preOrder(Node top)
		{
			if (top == null)
				return;

			System.out.printf("%d ", top.data);
			preOrder(top.left);
			preOrder(top.right);
		}
		public void postOrder(Node top)
		{
			if (top == null)
				return;

			postOrder(top.left);
			postOrder(top.right);
			System.out.printf("%d ", top.data);
		}
	}
}
