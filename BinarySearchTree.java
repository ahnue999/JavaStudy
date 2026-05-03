public class BinarySearchTree
{
	public static void main(String[] args)
	{
		int a = 1;
	}
	public class Node
	{
		int data;
		Node left, right;

		public Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}

	public class BST
	{
		Node top;

		public boolean isEmpty()
		{
			return (top == null);
		}

		public void insert(int value)
		{
			top = insertHelper(top, value);
		}
		public Node insertHelper(Node node, int value)
		{
			if (node == null)
				return (new Node(value));

			if (value > node.data)
			{
				node.right = insertHelper(node.right, value);
			}
			else if (value < node.data)
			{
				node.left = insertHelper(node.left, value);
			}

			return node;
		}
	}
}
