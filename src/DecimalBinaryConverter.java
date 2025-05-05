import java.util.Scanner;

public class DecimalBinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter decimal number: ");
                    int decimal = input.nextInt();
                    System.out.println("Binary output: " + Integer.toBinaryString(decimal));
                    break;
                case 2:
                    System.out.print("Enter binary number: ");
                    String binary = input.next();
                    try {
                        int dec = Integer.parseInt(binary, 2);
                        System.out.println("Decimal output: " + dec);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number.");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
