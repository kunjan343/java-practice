import java.util.Scanner;

// Calculate area of circle
public class Circle {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Declaration
        int radius;
        double area;

        System.out.println("Please enter radius:");
        // Read input number
        radius = input.nextInt();

        if (radius < 0) {
            System.out.println("Please enter correct value:");
            System.exit(1);
        }

        // formula for area of circle
        area = radius * radius * Math.PI;

        // Print area
        System.out.println("Area of circle having radius " + radius + " is: " + area);
        System.out.printf("Area of circle having radius %d is %.2f", radius, area); // reference notation
    }
}
