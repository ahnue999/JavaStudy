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
