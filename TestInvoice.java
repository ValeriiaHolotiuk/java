public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("Laptop", 2, 1200.00);
        Invoice inv2 = new Invoice("Mouse", 5, 25.50);
        Invoice inv3 = new Invoice("Keyboard", 3, 49.99);
        Invoice inv4 = new Invoice(inv2);  


        System.out.println(inv1);
        System.out.println(inv2);
        System.out.println(inv3);
        System.out.println(inv4); 

        System.out.println("Total Invoices Created: " + Invoice.getInvoiceCount());
    }
}
