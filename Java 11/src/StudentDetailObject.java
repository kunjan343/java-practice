import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetailObject {
    // Method to print each student detail
    private static void printInfo(Object[][] studentDetails) {
        // print information
        System.out.println("Student Directory:");
        for (Object[] student:studentDetails) {
            System.out.printf("%s\t%s\t%s\n", student[0], student[1], student[2]);
        }
    }

    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Ask number of student
        System.out.println("How many students are there?");
        int students = input.nextInt();
        // Variable initialization
        Object[][] studentDetails = new Object[students][3];
        // Ask to enter detail
        System.out.println("Enter Student Detail (FirstName-LastName-Age)");
        int i = 0;
        while (i < students) {
            Object[] student = input.next().split("-");
            studentDetails[i] = student;
            i += 1;
            System.out.println(i);
        }
        // Print student detail
        printInfo(studentDetails);
    }
}
