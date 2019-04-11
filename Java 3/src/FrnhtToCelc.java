import java.util.Scanner;

public class FrnhtToCelc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Scan Fahrenheit value
        System.out.println("Enter Fahrenheit temp:");
        float fern = input.nextFloat();

        // Perform conversion
        double calc = (5.0 / 9.0) * (fern - 32);

        // Print output
        System.out.printf("Temp %.2f Fahrenheit equivalent to %.2f Celsius .", fern, calc);
    }
}
