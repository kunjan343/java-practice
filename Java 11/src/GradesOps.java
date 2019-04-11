import java.util.Scanner;

public class GradesOps {
    // Print result for each marks
    private static void displayGrade(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90) {
                System.out.println(grades[i] + " : A");
            } else if (grades[i] >= 80) {
                System.out.println(grades[i] + " : B");
            } else if (grades[i] >= 70) {
                System.out.println(grades[i] + " : C");
            } else if (grades[i] >= 60) {
                System.out.println(grades[i] + " : D");
            } else {
                System.out.println(grades[i] + " : FAIL");
            }
        }
    }

    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Ask for number of results
        System.out.println("How many results you want to evaluate?");
        int results = input.nextInt();
        // Marks array to store results
        int[] marks = new int[results];

        // Read each result
        System.out.println("Enter marks:");
        for (int i = 0; i < results; i++) {
            marks[i] = input.nextInt();
        }

        displayGrade(marks);
    }
}
