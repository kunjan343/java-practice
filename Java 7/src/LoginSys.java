import java.util.Scanner;

public class LoginSys {
    public static void main(String[] args) {
        // Constant variable
        final String USERNAME = "patkunja";
        final String PASSWORD = "asdf";

        // Scanner class
        Scanner input = new Scanner(System.in);

        // Read username
        System.out.println("Please enter username:");
        String username = input.next();

        // Check if user is exist in system
        if (!username.equals(USERNAME)) {
            System.out.println("User not found");
            return;
        }

        // Read password
        System.out.println("Enter password:");
        String password = input.next();

        // Check if password is correct or not
        if (!password.equals(PASSWORD)) {
            System.out.println("password doesnt match");
            return;
        }

        // Success message
        System.out.println("Successfully logged in");
    }
}
