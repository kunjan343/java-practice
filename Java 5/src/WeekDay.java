import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Array of Weekdays
        List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

        // Take user input
        System.out.println("Enter your weekday number");
        int day = input.nextInt();

        // Check if input is correct or not
        while (day > 7 || day < 1) {
            System.out.println("Please enter correct day number.");
            day = input.nextInt();
        }
        
        // Print output
        System.out.println("Your weekday is " + days.get(day - 1));
    }
}