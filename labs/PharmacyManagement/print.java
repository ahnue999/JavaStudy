

public class Medicine {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Medicine(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void sell(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println("Sale completed.");
        } else {
            System.out.println("Sale cannot be completed.");
        }
    }

    public void addStock(int amount) {
        if (amount > 0) quantity += amount;
    }

    public void displayInfo() {
        System.out.println( "ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}





public abstract class MedicineBase {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public MedicineBase(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract void displayInfo();
}





public class OTCMedicine extends MedicineBase {
    private String usageCategory;

    public OTCMedicine(
            int id, String name, double price,
            int quantity, String usageCategory) {

        super(id, name, price, quantity);
        this.usageCategory = usageCategory;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "OTC Medicine - ID: " + getId()
            + ", Name: " + getName()
            + ", Price: " + getPrice()
            + ", Quantity: " + getQuantity()
            + ", Category: " + usageCategory
        );
    }
}





public class PrescriptionMedicine extends MedicineBase {

    private boolean prescriptionRequired;

    public PrescriptionMedicine(int id, String name, double price, int quantity, boolean prescriptionRequired) {
        super(id, name, price, quantity);
        this.prescriptionRequired = prescriptionRequired;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Prescription Medicine - ID: " + getId()
            + ", Name: " + getName()
            + ", Price: " + getPrice()
            + ", Quantity: " + getQuantity()
            + ", Prescription Required: "
            + prescriptionRequired
        );
    }
}





import java.util.ArrayList;

public class PharmacyApp {

	public static int countMeds ( ArrayList<Medicine> medicines)
	{
		int count = 0;
		ArrayList<Medicine> tmp = new ArrayList<>();

		for (Medicine med : medicines)
		{
			if (!checkMedicine(tmp, med.getName()))
			{
				tmp.add(med);
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		ArrayList<Medicine> medicines = new ArrayList<>();

		medicines.add(new Medicine(101, "Paracetamol", 25.50, 20));
		medicines.add(new Medicine(101, "Paracetamol", 25.50, 20));
		medicines.add(new Medicine(101, "Paracetamol", 25.50, 20));
		medicines.add(new Medicine(102, "Amoxicillin", 80.00, 10));
		medicines.add(new Medicine(102, "Amoxicillin", 80.00, 10));
		medicines.add(new Medicine(103, "Vitamin C", 45.00, 15));
		medicines.add(new Medicine(357, "Ibuprofen", 35.75, 12));


		System.out.println("===== Pharmacy Stock =====");

		for (Medicine medicine : medicines)
			medicine.displayInfo();



		// Task 2 Print the Number of Medicine Records
		System.out.println("Total medicines: " + medicines.size());
		System.out.println("Total medicines with no duplicates: " + countMeds(medicines));

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

	public static boolean checkMedicine ( ArrayList<Medicine> medicines, String name)
	{
		for (Medicine medicine : medicines) {
			if (medicine.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}





import java.util.ArrayList;

// For the new abstraction MedicineBase
public class PharmacyApp2 {
	public static void main(String[] args) {
		ArrayList<MedicineBase> stock = new ArrayList<>();

		stock.add(new PrescriptionMedicine( 201, "Antibiotic X", 90.0, 8, true));

		stock.add(new OTCMedicine( 202, "Pain Relief", 30.0, 20, "Adults"));

		for (MedicineBase medicine : stock)
			medicine.displayInfo();

		System.out.println("\n===== FINAL PHARMACY REPORT =====");

		for (MedicineBase medicine : stock)
			medicine.displayInfo();

		System.out.println( "Total medicine records: " + stock.size());
	}
}
