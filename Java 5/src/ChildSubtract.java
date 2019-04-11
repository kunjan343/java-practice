import java.util.Scanner;

public class ChildSubtract {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Random int
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        // Correct the position of bigger number
        /*
         * 4 6
         * num2 = 4-6 = -2
         * num1 = 4-(-2) = 6
         * num2 = 6+(-2) = 4
         * */
        if (num1 < num2) {
            num2 = num1 - num2;
            num1 = num1 - num2;
            num2 = num1 + num2;
        }

        // Ask for answer
        System.out.println("What is the result of " + num1 + "-" + num2 + "?");
        int childInput = input.nextInt();

        int actualResult = num1 - num2;
        // Print result
        if (childInput == actualResult) {
            System.out.println("Your answer is correct.");
        } else {
            System.out.println("The correct answer is " + actualResult);
        }
    }
}
