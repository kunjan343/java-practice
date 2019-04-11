import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Ask for input number
        System.out.println("Enter your factorial number:");
        int factNumber = input.nextInt();
        double factorialSum = factNumber;

        // Count factorial sum for number
        while (factNumber > 1) {
            factorialSum *= factNumber - 1;
            factNumber -= 1;
        }

        // Print factorial sum of input number
        System.out.println("Factorial of number is :" + factorialSum);
    }
}
