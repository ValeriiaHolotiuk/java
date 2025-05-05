import java.util.Scanner;
public class LargestOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The largest number is: " + max);
    }
}