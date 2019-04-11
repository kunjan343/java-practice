import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);

        // Ask user for enter word
        System.out.println("Enter your string:");
        String word = input.next();

        // Declare variable for counting
        int wordLength = word.length();
        int vowelsCount = 0;

        // Print total number of char
        System.out.println("Number of character in word: " + wordLength);

        // Count vowels in word
        for (int i = 0; i < wordLength; i++) {
            int c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }

        // Print vowels count
        System.out.println("Total number of vowels are: " + vowelsCount);
    }
}
