import java.util.Scanner;
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];
        int[] frequency = new int[10];

        System.out.println("Enter 100 numbers (from 0 to 9):");
        for (int i = 0; i < 100; i++) {
            int num = input.nextInt();
            if (num >= 0 && num <= 9) {
                numbers[i] = num;
                frequency[num]++;
            } else {
                System.out.println("Invalid input, enter a number between 0 and 9");
                i--; 
            }
        }

        System.out.println("Number\tFrequency");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + frequency[i] + " times");
        }
    }
}
