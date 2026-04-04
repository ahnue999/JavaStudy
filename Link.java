public class Link
{
	public static void main(String[] args)
	{
		LinkedList mylist = new LinkedList();

		mylist.insertLast(5);
		mylist.insertLast(1);
		mylist.insertLast(4);
		mylist.insertLast(1);
		mylist.insertLast(2);
		mylist.insertFirst(2);

		System.out.println("Before deleteFirst");
		mylist.printlist();

		mylist.deleteFirst();
		mylist.deleteLast();
		System.out.println("After deleteFirst and last");

		if (mylist.find(3) != null)
		{
			System.out.println("found!");
		}
		else
		{
			System.out.println("not found!");
		}

		mylist.printlist();

		System.out.println("After delete 5");
		mylist.delete(5);
		mylist.printlist();


	}
	public static class Node
	{
		public int data;
		public Node next;

		public Node(int d)
		{
			data = d;
		}
	}

	public static class LinkedList
	{
		private Node top;

		public LinkedList()
		{
			top = null;
		}

		public boolean isEmpty()
		{
			return (top == null);
		}

		public void insertFirst(int data)
		{
			Node tmp = new Node(data);
			tmp.next = top;
			top = tmp;
		}

		public void insertLast(int data)
		{
			Node tmp = new Node(data);

			if (isEmpty())
			{
				top = tmp;
			}
			else 
			{
				Node curr = top;
				while(curr.next != null)
				{
					curr = curr.next;
				}
				curr.next = tmp;
			}
		}

		public Node deleteFirst()
		{
			if (isEmpty()) return null;
			Node tmp = top;
			top = top.next;
			return tmp;
		}

		public void deleteLast()
		{
			if (isEmpty()) return;

			Node curr = top;
			Node prev = top;

			if (curr.next == null)
			{
				top = null;
				return;
			}

			while(curr.next != null)
			{
				prev = curr;
				curr = curr.next;
			}
			prev.next = null;
		}

		public Node find(int key)
		{
			Node curr = top;

			while (curr != null)
			{
				if (curr.data == key)
				{
					return curr;
				}
				curr = curr.next;
			}
			return null;
		}

		public Node delete(int key)
		{
			Node prev = top;
			Node curr = top;
			Node temp;

			while (curr != null)
			{
				if (curr.data == key)
				{
					if (curr == top)
					{
						return (deleteFirst());
					}
					temp = curr;
					prev.next = curr.next;

					return temp;
				}
				prev = curr;
				curr = curr.next;
			}
			return null;
		}

		public void printlist()
		{
			Node curr = top;
			while(curr != null)
			{
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
	}
}
