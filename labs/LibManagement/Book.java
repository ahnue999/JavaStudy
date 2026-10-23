public class Book extends LibraryItem {
    private int availableCopies;

    public Book(int id, String title, int availableCopies) {
		super(id, title);
        this.availableCopies = availableCopies;
    }


	public int getAvailableCopies() {
		return availableCopies;
	}

	public void borrowBook() {
		if (availableCopies > 0) {
			availableCopies--;
			System.out.println("Book borrowed successfully.");
		} else {
			System.out.println("No available copies.");
		}
	}

	public void returnBook() {
		availableCopies++;
		System.out.println("Book returned successfully.");
	}

	@Override
	public void displayInfo() {
		System.out.println(
				"Book - ID: " + getId() +
				", Title: " + getTitle() +
				", Available Copies: " + availableCopies
				);
	}
}
