import java.util.Scanner;

public class CountTime {

    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int remainSeconds = 0;
        int inputSeconds = 0;

        // Scanner class for input
        Scanner input = new Scanner(System.in);

        // Read input seconds
        System.out.println("Enter seconds you want to convert?");
        inputSeconds = input.nextInt();

        // Count hours
        hours = inputSeconds / 3600;
        remainSeconds = inputSeconds % 3600;

        // Count minutes
        minutes = remainSeconds / 60;
        remainSeconds = inputSeconds % 60;

        System.out.println("Time is:" + hours + " hours " + minutes + " minutes " + remainSeconds + " seconds");
    }
}
