import java.util.Scanner;

public class DivideTwoThree {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter your number:");
        int number = input.nextInt();

        // AND condition
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 AND 3.");
        }
        // OR condition
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 OR 3.");
        }
        // XOR condition
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by 2 OR 3, BUT not both.");
        }
    }
}
