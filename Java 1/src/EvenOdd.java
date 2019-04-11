// Check number is even or odd
public class EvenOdd {
    // Main method
    public static void main(String[] args) {

        // Variable declaration and initialization
        int numbers[] = {51, 74, 485, 467};

        // Run logic for each number in array
        for (int index = 0; index < numbers.length; index++) {

            // Check if number is even or odd
            if (numbers[index] % 2 == 0) {
                System.out.println(numbers[index] + " is Even."); // Even
            } else {
                System.out.println(numbers[index] + " is Odd."); // Odd
            }
        }
    }
}
