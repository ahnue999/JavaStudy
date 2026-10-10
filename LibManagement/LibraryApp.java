import java.util.ArrayList;

public class LibraryApp {

    public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java Programming", 3));
        books.add(new Book(102, "Database Fundamentals", 2));
        books.add(new Book(103, "Computer Networks", 4));

		books.add(new Book(357, "Physics", 5));

		System.out.println("===== Library Books =====");

        for (Book book : books) {
            book.displayInfo();
        }

        System.out.println("\nBorrowing Java Programming...");
        books.get(0).borrowBook();

        System.out.println("\nAfter Borrowing:");
        books.get(0).displayInfo();

        System.out.println("\nReturning Java Programming...");
        books.get(0).returnBook();

        System.out.println("\nAfter Returning:");
        books.get(0).displayInfo();

		System.out.println("Total books: " + books.size());

		String requiredTitle = "Physics";
		boolean found = false;

		for (Book book : books) {
			if (book.getTitle().equals(requiredTitle)) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Title is available.");
		} else {
			System.out.println("Title is not available.");
		}

		for (Book book : books) {
			if (book.getTitle().equals("Physics")) {
				System.out.println( "Available copies: " + book.getAvailableCopies());
			}
		}

		for (Book book : books) {
			if (book.getTitle().equals("Physics")) {
				while (book.getAvailableCopies() > 0)
					book.borrowBook();
			}
		}

		for (Book book : books) {
			if (book.getTitle().equals("Physics")) {
				book.returnBook();
				break;
			}
		}

		Book result = findBookById(books, 357);

		if (result != null) {
			result.displayInfo();
		} else {
			System.out.println("Book not found.");
		}
	}

	public static Book findBookById(ArrayList<Book> books, int id) {

		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

}
