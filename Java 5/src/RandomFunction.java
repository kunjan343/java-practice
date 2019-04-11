import java.util.Scanner;

public class RandomFunction {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Random function
        int x = (int) (Math.random() * 10);
        System.out.println(x);

        // Read input number
        System.out.println("Please enter your number");
        x = input.nextInt();

        // Check what number is it
        if (x > 0) {
            System.out.println("Your number is POSITIVE.");
        } else if (x < 0) {
            System.out.println("Your number is NEGATIVE.");
        } else {
            System.out.println("You love to use ZERO.");
        }
    }
}
