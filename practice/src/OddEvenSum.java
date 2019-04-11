import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Sak for number of values
        System.out.println("How many number you want to enter");
        int totalNumber = input.nextInt();
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < totalNumber; i++) {
            // Read eac number
            int nextNumber = input.nextInt();
            if (i % 2 == 0) {
                // Count sum of even numbers
                evenSum += nextNumber;
            } else {
                // Count sum of odd numbers
                oddSum += nextNumber;
            }
        }

        // Print sum of even numbers
        System.out.println("Sum of even numbers : " + evenSum);
        // Print sum of odd numbers
        System.out.println("Sum of odd numbers : " + oddSum);
    }
}
