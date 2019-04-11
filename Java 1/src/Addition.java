import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers:");
        // Read two input number
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // formula for summation
        double sum = num1 + num2;

        // Print sum
        System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
    }
}
