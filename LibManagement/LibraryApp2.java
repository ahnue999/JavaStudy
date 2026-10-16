import java.util.ArrayList;

/* With the inclusion of Book under library item, a new main was made
 for consistency using its own updated class scheme.*/
public class LibraryApp2 {

	public static void main(String[] args) {
		ArrayList<LibraryItem> items = new ArrayList<>();

		items.add(new Book(357, "Physics", 5));
		items.add(new Book(102, "Database Fundamentals", 2));
		items.add(new Magazine(501, "Science Today", 12));

		for (LibraryItem item : items) {
			item.displayInfo();
		}

		System.out.println("\n===== FINAL LIBRARY REPORT =====");

		for (LibraryItem item : items) {
			item.displayInfo();
		}

		System.out.println("Total library items: " + items.size());
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
