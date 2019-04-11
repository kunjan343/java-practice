import java.util.ArrayList;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize values
        // ArrayList<Double> products = new ArrayList<>(); // Dynamic Array
        double billingAmount = 0.0;
        int tax = 13;

        // Read number of items
        System.out.println("How many items are there?:");
        int items = input.nextInt();

        // Take input of price of all items
        for (int index = 0; index < items; index++) {
            System.out.println("Enter price of Item " + (index + 1));
            billingAmount += input.nextDouble();
        }

        // Count Tax and print
        double taxAmount = (tax * billingAmount) / 100;
        System.out.printf("\nYou have to pay %.2f tax.\n", taxAmount);

        // Count and print total billing amount
        billingAmount += taxAmount;
        System.out.printf("Total billing amount is : %.2f", billingAmount);
    }
}
