import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, sum = 0, num;

        System.out.println("Enter numbers (-999 to stop):");
        while ((num = input.nextInt()) != -999) {
            sum += num;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
