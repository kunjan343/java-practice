import java.util.Scanner;

public class RunwayLength {

    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Read airplane speed
        System.out.print("Enter speed of an airplane as m/s: ");
        int planeSpeed = input.nextInt();

        // Read airplane acceleration
        System.out.print("Enter acceleration of an airplane as m/s2: ");
        double planeAcceleration = input.nextDouble();

        // Count runway length
        double runwayLength = Math.pow(planeSpeed, 2) / (2 * planeAcceleration);

        // Print runway length
        System.out.printf("The minimum runway length for airplane is %.3f", runwayLength);
    }
}
