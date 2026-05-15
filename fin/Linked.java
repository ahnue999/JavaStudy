public class Linked
{
	public static void main(String[] args)
	{
		llist mylist = new llist();

		mylist.insertFirst(1);
		mylist.insertFirst(4);
		mylist.insertFirst(6);
		mylist.insertFirst(2);

		mylist.display();

		System.out.println("Find 1: " + mylist.find(1));
		System.out.println("Find 2: " + mylist.find(2));
		System.out.println("Find 3: " + mylist.find(3));

		mylist.delete(1);
		mylist.display();
	}
	public static class Node
	{
		public int data;
		public Node next;

		public Node(int n)
		{
			data = n;
			next = null;
		}
	}
	public static class llist
	{
		Node head;

		public llist ()
		{
			head = null;
		}

		public boolean isEmpty()
		{
			return (head == null);
		}

		public void insertFirst(int n)
		{
			Node tmp = new Node(n);

			tmp.next = head;
			head = tmp;
		}

		public Node deleteFirst()
		{
			if (isEmpty())
			{
				return (null);
			}
			Node tmp = head;
			head = head.next;
			return tmp;
		}

		public Node find(int key)
		{
			Node curr;
			curr = head;

			while (curr != null && curr.data != key)
			{
				curr = curr.next;
			}

			return curr;
		}

		public Node delete(int key)
		{
			Node prev, curr;
			curr = head;
			prev = null;

			while (curr != null && curr.data != key)
			{
				prev = curr;
				curr = curr.next;
			}

			if (curr == null)
				return (null);

			if (prev == null)
				head = head.next;
			else
				prev.next = curr.next;

			return curr;
		}

		public void display()
		{
			Node tmp = head;
			while (tmp != null)
			{
				System.out.printf("%d ", tmp.data);
				tmp = tmp.next;
			}
			System.out.println();
		}
	}
}
