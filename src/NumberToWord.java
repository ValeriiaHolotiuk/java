import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a one-digit number (0-9): ");
        int num = input.nextInt();

        if (num < 0 || num > 9) {
            System.out.println("Error: Please enter a one-digit number.");
            return;
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("You entered: " + words[num]);
    }
}













