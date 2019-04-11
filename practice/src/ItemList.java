import java.util.Scanner;

public class ItemList {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.println("How many items did you buy?");
        int numberOfItems = input.nextInt();
        int currentItem = 1;
        int billingPrice = 0;

        // Read input numbers
        while (numberOfItems > 0) {
            System.out.println("Enter price of item " + currentItem);
            int currentItemPrice = input.nextInt();
            billingPrice += currentItemPrice;
            currentItem += 1;
            numberOfItems -= 1;
        }

        // Print total billing price
        System.out.println("Your billing price is " + billingPrice);
    }
}
