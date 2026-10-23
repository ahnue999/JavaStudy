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
        System.out.println(
            "ID: " + id + ", Name: " + name +
            ", Price: " + price + ", Quantity: " + quantity
        );
    }
}
