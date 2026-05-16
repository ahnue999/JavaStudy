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
		myBST.inOrder();
		System.out.println("\npreOrder:");
		myBST.preOrder(myBST.root);
		System.out.println("\npostOrder:");
		myBST.postOrder(myBST.root);

		System.out.println("Find 5: " + myBST.find(5));
		System.out.println("Find 9: " + myBST.find(9));

		myBST.delete(3);
		System.out.println("\ninOrder after deleting 3:");
		myBST.inOrder(myBST.root);
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
		Node root;

		public boolean isEmpty()
		{
			return (root == null);
		}

		public void insert(int n)
		{
			Node tmp = new Node(n);

			if (isEmpty())
			{
				root = tmp;
				return;
			}

			Node curr = root;
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
			Node curr = root;

			while (curr != null && curr.data != key)
			{
				if (key < curr.data)
					curr = curr.left;
				else
					curr = curr.right;
			}

			return curr;
		}

		public void inOrder()
		{
			inOrder(root);
		}
		private void inOrder(Node root)
		{
			if (root == null)
				return;

			inOrder(root.left);
			System.out.printf("%d ", root.data);
			inOrder(root.right);
		}
		public void preOrder(Node root)
		{
			if (root == null)
				return;

			System.out.printf("%d ", root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
		public void postOrder(Node root)
		{
			if (root == null)
				return;

			postOrder(root.left);
			postOrder(root.right);
			System.out.printf("%d ", root.data);
		}
		public Node minimum(Node node)
		{
			if (node == null)
				return null;

			while (node.left != null)
				node = node.left;

			return node;
		}
		public Node maximum(Node node)
		{
			if (node == null)
				return null;

			while (node.right != null)
				node = node.right;

			return node;
		}

		public void delete(int key)
		{
			root = deleteRec(root, key);
		}
		private Node deleteRec(Node root, int key)
		{
			if (root == null)
				return null;

			if (key < root.data)
				root.left = deleteRec(root.left, key);
			else if (key > root.data)
				root.right = deleteRec(root.right, key);
			else
			{
				if (root.left == null)
					return root.right;

				if (root.right == null)
					return root.left;

				Node successor = minimum(root.right);
				root.data = successor.data;
				root.right = deleteRec(root.right, successor.data);
			}

			return root;
		}
	}
}
