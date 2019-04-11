import java.util.Scanner;

public class CharOps {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // read char
        System.out.println("Enter character :");
        char inputChar = input.next().charAt(0);

        // Print whether its number, letter or special char
        if (Character.isDigit(inputChar)) {
            System.out.println("Input is Number.");
        } else if (Character.isLetter(inputChar)) {
            System.out.println("Input is Letter.");
            if (Character.isLowerCase(inputChar)) {
                System.out.println("Uppercase is : " + Character.toUpperCase(inputChar));
            }
        } else {
            System.out.println("Input is Special char.");
        }
    }
}
