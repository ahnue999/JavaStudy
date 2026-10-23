public class PrescriptionMedicine extends MedicineBase {
    private boolean prescriptionRequired;

    public PrescriptionMedicine(
            int id, String name, double price,
            int quantity, boolean prescriptionRequired) {

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
