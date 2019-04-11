import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        // final value
        final String SAVED_PASSWORD = "spaetzle@";

        // Scanner class
        Scanner input = new Scanner(System.in);

        // Ask for input
        System.out.println("Enter password:");
        String inputPassword = input.next();

        // Check and print output
        if (inputPassword.equals(SAVED_PASSWORD)) {
            System.out.println("the password is accepted");
        } else {
            System.out.println("Invalid password");
        }
    }
}
