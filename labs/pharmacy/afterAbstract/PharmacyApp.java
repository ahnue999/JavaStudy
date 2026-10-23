import java.util.ArrayList;

public class PharmacyApp {
	public static void main(String[] args) {
		ArrayList<MedicineBase> stock = new ArrayList<>();

		stock.add(new PrescriptionMedicine( 201, "Antibiotic X", 90.0, 8, true));

		stock.add(new OTCMedicine( 202, "Pain Relief", 30.0, 20, "Adults"));

		for (MedicineBase medicine : stock)
			medicine.displayInfo();
	}
