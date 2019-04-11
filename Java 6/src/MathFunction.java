import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Value between 10 to 30
        System.out.println("Value between 10 to 30 : " + (10 + (int) (Math.random() * 20)));

        // Get angle from user
        System.out.println("Please Enter angle to measure:");
        double angle = input.nextDouble();

        // Print sin value
        System.out.println("Sin(x) : " + Math.sin(Math.toRadians(angle)));
        // Print cos value
        System.out.println("Cos(x) : " + Math.cos(Math.toRadians(angle)));
        // Print tan value
        System.out.println("Tan(x) : " + Math.tan(Math.toRadians(angle)));

        // Count respective divider for angle
        double divider = 180 / angle;
        // Display in PI format
        System.out.println("Your angle match with : PI/" + divider);

        // Rounding function
        System.out.println("Math.ceil 80.1: " + Math.ceil(80.1));
        System.out.println("Math.floor 80.1: " + Math.floor(80.1));
        System.out.println("Math.round 80.1: " + Math.round(80.1));
    }
}
