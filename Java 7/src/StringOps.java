import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String:");
        String text = input.next();

        System.out.println("Length: " + text.length());
        System.out.println("4th char: " + text.charAt(3));
        System.out.println("Concatenation: " + text.concat("-HELP"));
        System.out.println("Concatenation: " + text.replace("c", "CHANGED"));
        System.out.println("UpperCase: " + text.toUpperCase());
        System.out.println("LowerCase: " + text.toLowerCase());
        System.out.println("Trim: " + text.trim());
        System.out.println("Compare: " + text.compareTo("abgdef"));
    }
}
