public class Invoice {
    private String item;
    private int quantity;
    private double price;
    private static int invoiceCount = 0;

    public Invoice(String item, int quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        invoiceCount++;
    }

    public Invoice(Invoice other) {
        this.item = other.item;
        this.quantity = other.quantity;
        this.price = other.price;
        invoiceCount++;
    }

    public static int getInvoiceCount() {
        return invoiceCount;
    }

    public String toString() {
        return "Item: " + item + ", Quantity: " + quantity + ", Price: $" + price +
               ", Total: $" + (quantity * price);
    }
}
