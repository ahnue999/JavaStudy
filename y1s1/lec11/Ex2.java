import java.util.ArrayList;

public class Ex2
{
	public static void main(String[] args)
	{
		Library cityLibrary = new Library();

		Book ReZero = new Book("Rezero: Kara Hajimaru", "Nagatsuki Tappi", "0316315303");
		Book Zaregoto = new Book("Zaregoto", "nisioisin", "0911215703");
		Book Fremd = new Book("Fremd Torturchen", "Keishi Ayasato", "0886115711");

		cityLibrary.addBook(ReZero);
		cityLibrary.addBook(Zaregoto);
		cityLibrary.addBook(Fremd);

		cityLibrary.displayAllBooks();

		cityLibrary.removeBook("Zaregoto");
		cityLibrary.displayAllBooks();
	}
	public static class Book
	{
		String title;
		String author;
		String isbn;

		public Book(String title, String author, String isbn)
		{
			this.title = title;
			this.author = author;
			this.isbn = isbn;
		}

		public String getTitle()
		{
			return(title);
		}

		public String getAuthor()
		{
			return(author);
		}
	}

	public static class Library
	{
		ArrayList<Book> books = new ArrayList<Book>();

		public void addBook(Book newBook)
		{
			books.add(newBook);
		}

		public Boolean removeBook(String title)
		{
			for (int i = 0; i < books.size(); i++)
			{
				if (books.get(i).getTitle().equalsIgnoreCase(title))
				{
					books.remove(i);
					return true;
				}
			}
			return false;
		}

		public void displayAllBooks()
		{
			System.out.printf("\n\t\tBooks List\n");
			System.out.printf("%-25s| %s\n", "Title", "Author");
			for (Book book : books)
			{
				System.out.printf("%-25s| %s\n", book.getTitle(), book.getAuthor());
			}
		}
	}
}
