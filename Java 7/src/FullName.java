import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter full name:");
        String fullName = input.next();

        String nameFraction[] = fullName.split("\\s+");

        System.out.println("first name: " + nameFraction.length);
        System.out.println("last name: " + nameFraction[1]);
    }
}
