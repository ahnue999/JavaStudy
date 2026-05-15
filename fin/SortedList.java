public class SortedList
{
	public static void main(String[] args)
	{
		llist mylist = new llist();

		mylist.insert(1);
		mylist.insert(4);
		mylist.insert(6);
		mylist.insert(2);
		mylist.insert(3);
		mylist.insert(7);
		mylist.insert(5);

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

		public void insert(int n)
		{
			Node tmp = new Node(n);

			if (isEmpty())
			{
				head = tmp;
				return;
			}
			Node curr, prev;
			prev = null;
			curr = head;

			while (curr != null && n > curr.data)
			{
				prev = curr;
				curr = curr.next;
			}

			if (prev == null)
				head = tmp;
			else
				prev.next = tmp;

			tmp.next = curr;
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
