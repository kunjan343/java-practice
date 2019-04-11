import java.util.Scanner;

public class SwapVariable {

    public static void main(String[] args) {

        // Temp variable to swap value
        float tempVariable = 0.0f;
        Scanner input = new Scanner(System.in);

        // Scan first variable
        System.out.println("Enter first value:");
        float var1 = input.nextFloat();

        // Scan second variable
        System.out.println("Enter first value:");
        float var2 = input.nextFloat();

        // Perform swapping
        tempVariable = var1;
        var1 = var2;
        var2 = tempVariable;

        // Print output

        System.out.println("Your first value is:" + var1);
        System.out.println("Your second value is:" + var2);
    }
}
