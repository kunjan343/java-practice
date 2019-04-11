import java.util.Scanner;

public class GreatSmallNumber {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Ask user for input total numbers
        System.out.println("How many number you want to enter?");
        int totalNumbers = input.nextInt();
        int greatNumber = 0;
        int smallNumber = 0;
        int[] numbers = new int[totalNumbers];

        // Read all input numbers
        System.out.println("Enter your numbers:");
        while (totalNumbers > 0) {
            int number = input.nextInt();
            numbers[totalNumbers - 1] = number;
            totalNumbers -= 1;
            smallNumber = number;
        }

        for (int i = 0; i < numbers.length; i++) {
            // Check if any number is negative
            if (numbers[i] < 0) {
                System.out.println("Negative numbers are not allowed");
                System.exit(-1);
            }
            // Find greatest number
            if (greatNumber < numbers[i]) {
                greatNumber = numbers[i];
            }
            // Find smallest number
            if (smallNumber > numbers[i]) {
                smallNumber = numbers[i];
            }
        }

        // Print greatest number
        System.out.println("Great Number :" + greatNumber);
        // Print smallest number
        System.out.println("Smaller Number :" + smallNumber);

    }
}
