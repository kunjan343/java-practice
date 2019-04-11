import java.util.Scanner;

public class HiFiveEven {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Read input number
        System.out.println("Enter integer value");
        int value = input.nextInt();

        // Check if number is divisible by 5
        if (value % 5 == 0) {
            System.out.println("HiFive!");
        }

        // Check if number is divisible by 2
        if (value % 2 == 0) {
            System.out.println("HiEven!");
        }
    }
}
