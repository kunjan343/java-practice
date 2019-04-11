import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Take number of subjects from user
        System.out.println("How many subjects do you have?");
        int numberOfSubjects = input.nextInt();
        int count = 0;
        double currentMarks = 0, average = 0;

        // Read marks of each subject
        while (count < numberOfSubjects) {
            System.out.printf("Enter grade for subject %d :", count);
            currentMarks = input.nextDouble();
            // If value is wrong then go to ask again
            if (currentMarks <= 100 && currentMarks >= 0) {
                average += currentMarks;
                count++;
            } else {
                System.out.println("Please enter correct marks");
            }
        }
        // Find average marks
        average /= count;
        // Print marks
        System.out.printf("Your average marks are: %.2f \n", average);

        // Print grade or notify user is fail
        if (average > 90) {
            System.out.println("You passed with A grade :)");
        } else if (average > 80) {
            System.out.println("You passed with B grade :)");
        } else if (average > 70) {
            System.out.println("You passed with C grade :)");
        } else if (average > 60) {
            System.out.println("You passed with D grade :)");
        } else if (average > 50) {
            System.out.println("You passed with E grade :)");
        } else {
            System.out.println("You failed in exam :(");
        }
    }
}
