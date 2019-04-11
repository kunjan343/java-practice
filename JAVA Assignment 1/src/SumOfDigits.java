import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        int sumOfDigits = 0, extractedDigit;

        // Read input digit
        System.out.print("Enter a number between 0 and 1000: ");
        int inputNumber = input.nextInt();

        // Take correct input from user if number is not in range
        while (inputNumber <= 0 || inputNumber >= 1000) {
            System.out.println("You have to enter correct number:");
            inputNumber = input.nextInt();
        }

        // Count sum of digits
        while (inputNumber > 0) {
            extractedDigit = inputNumber % 10; // Do not declare variables inside loop ever
            sumOfDigits += extractedDigit;
            inputNumber /= 10;
        }

        // Print sum of digit
        System.out.printf("The sum of digits is %d", sumOfDigits);
    }
}
