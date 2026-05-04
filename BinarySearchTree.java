public class BinarySearchTree
{
	public static void main(String[] args)
	{
		BST mybst = new BST();

		mybst.insert(2);
		mybst.insert(1);
		mybst.insert(3);
		mybst.insert(8);

		if (mybst.search(2) != null)
			System.out.println("2 Found!");
		if (mybst.search(8) != null)
			System.out.println("8 Found!");
		else
			System.out.println("8 not Found!");

		System.out.println("min is: " + mybst.findMin(mybst.top).data);
		System.out.println("max is: " + mybst.findMax(mybst.top).data);
		System.out.println("After 8 deletetion");
		mybst.delete(8);
		if (mybst.search(8) != null)
			System.out.println("8 Found!");
		else
			System.out.println("8 not Found!");
	}

	public static class Node
	{
		int data;
		Node left, right;

		public Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}

	public static class BST
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
		private Node insertHelper(Node node, int value)
		{
			if (node == null)
			{
				return (new Node(value));
			}

			if (value > node.data)
			{
				node.right = insertHelper(node.right, value);
			}
			else if (value < node.data)
			{
				node.left = insertHelper(node.left, value);
			}

			return (node);
		}

		public Node search(int value)
		{
			return (searchHelper(top, value));
		}
		private Node searchHelper(Node node, int value)
		{
			if (node == null)
			{
				return null;
			}

			if (value > node.data)
			{
				return (searchHelper(node.right, value));
			}
			if (value < node.data)
			{
				return (searchHelper(node.left, value));
			}

			return node;
		}

		public Node findMin(Node node)
		{
			if (node == null)
				return null;
			while (node.left != null)
				node = node.left;
			return node;
		}

		public Node findMax(Node node)
		{
			if (node == null)
				return null;
			while (node.right != null)
				node = node.right;
			return node;
		}

		public void delete(int value)
		{
			top = deleteHelper(top, value);
		}
		public Node deleteHelper(Node node, int value)
		{
			if (node == null)
				return null;

			if (value > node.data)
			{
				node.right = deleteHelper(node.right, value);
			}
			else if (value < node.data)
			{
				node.left = deleteHelper(node.left, value);
			}
			else
			{
				if (node.right == null)
					return node.left;
				if (node.left == null)
					return node.right;

				Node tmp = findMin(node.right);
				node.data = tmp.data;
				node.right = deleteHelper(node.right, tmp.data);
			}

			return node;
		}
	}
}
