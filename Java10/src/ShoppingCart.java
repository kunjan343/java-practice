import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Size of each bags
        int[] bags = new int[]{4, 6, 8, 10, 12};
        // List to store items
        List<Double> items = new ArrayList<>();
        // flag variable
        boolean bagsFull = false;
        double weight = 0;

        while (!bagsFull) {
            System.out.println("Enter Item weight:");
            weight = input.nextDouble();
            // Check and fill bags based on weight
            int i = 0;
            while (i < bags.length) {
                if (bags[i] >= weight) {
                    bags[i] -= weight;
                    items.add(weight);
                    bagsFull = false;
                    break;
                }
                i += 1;
                bagsFull = true;
            }

            // Notify user if bag is full
            if (bagsFull) {
                System.out.println("You can not store this item. Do you want to continue?");
                String answer = input.next();
                if ("yes".equals(answer)) {
                    bagsFull = false;
                }
            }
        }

        System.out.println("Items in bag:");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%.1f ", items.get(i));
        }
        System.out.println();

        for (int i = 0; i < bags.length; i++) {
            System.out.println("Bag number " + (i + 1) + ": " + bags[i]);
        }
    }
}
