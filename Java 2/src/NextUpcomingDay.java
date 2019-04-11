import java.util.Scanner;

public class NextUpcomingDay {
    public static void main(String[] args) {
        // Scanner class for input
        Scanner input = new Scanner(System.in);

        System.out.println("===Refer 0 as Sunday, 1 as Monday and 6 as Saturday===");

        // Read current day
        System.out.println("Which day is today?");
        int currentDay = input.nextInt();

        // Read skip days
        System.out.println("How many days after you want to meet?");
        int skipDays = input.nextInt();

        // Count next meeting day
        int meetingDay = (currentDay + skipDays) % 7;

        System.out.println("You will meet on " + meetingDay + "th Day.");
    }
}
