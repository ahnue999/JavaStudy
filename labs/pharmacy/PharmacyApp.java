import java.util.ArrayList;

public class PharmacyApp {
	public static void main(String[] args) {

		ArrayList<Medicine> medicines = new ArrayList<>();

		medicines.add(new Medicine(101, "Paracetamol", 25.50, 20));
		medicines.add(new Medicine(102, "Amoxicillin", 80.00, 10));
		medicines.add(new Medicine(103, "Vitamin C", 45.00, 15));
		medicines.add(new Medicine(357, "Ibuprofen", 35.75, 12));


		System.out.println("===== Pharmacy Stock =====");

		for (Medicine medicine : medicines)
			medicine.displayInfo();


		// Task 2 Print the Number of Medicine Records

		System.out.println("Total medicines: " + medicines.size());

		System.out.println("\nSelling 2 Paracetamol...");
		medicines.get(0).sell(2);

		System.out.println("\nAfter Sale:");
		medicines.get(0).displayInfo();

		System.out.println("\nAdding 5 Paracetamol...");
		medicines.get(0).addStock(5);

		System.out.println("\nAfter Adding Stock:");
		medicines.get(0).displayInfo();


		// Task 3 Search by name
		String requiredName = "Ibuprofen";
		boolean found = false;

		for (Medicine medicine : medicines) {
			if (medicine.getName().equals(requiredName)) {
				found = true;
				break;
			}
		}

		if (found) System.out.println("Medicine found.");
		else System.out.println("Medicine not found.");

		// Task 4 Display Quantity
		for (Medicine medicine : medicines) {
			if (medicine.getName().equals("Ibuprofen")) {
				System.out.println( "Available quantity: " + medicine.getQuantity());
			}
		}

		// Task 5 Sell Medicine
		for (Medicine medicine : medicines) {
			if (medicine.getName().equals("Ibuprofen")){
				medicine.sell(3);
				break;
			}
		}
		
		// Task 6, Reject an Invalid Sale
		for (Medicine medicine : medicines) {
			if (medicine.getName().equals("Ibuprofen")) {
				medicine.sell(20);
				break;
			}
		}

		// Task 7, Delete a Medicine
		for (int i = 0; i < medicines.size(); i++) {
			if (medicines.get(i).getId() == 103) {
				medicines.remove(i);
				break;
			}
		}

		// Task 10, Use the overloaded methods
		Medicine m1 = findMedicine(medicines, 357);
		Medicine m2 = findMedicine(medicines, "Ibuprofen");

		if (m1 != null) m1.displayInfo();
		if (m2 != null) m2.displayInfo();

	}

	// Task 8
	public static Medicine findMedicine( ArrayList<Medicine> medicines, int id)
	{
		for (Medicine medicine : medicines) {
			if (medicine.getId() == id) {
				return medicine;
			}
		}
		return null;
	}

	// Task 9
	public static Medicine findMedicine ( ArrayList<Medicine> medicines, String name)
	{
		for (Medicine medicine : medicines) {
			if (medicine.getName().equals(name)) {
				return medicine;
			}
		}
		return null;
	}
}
