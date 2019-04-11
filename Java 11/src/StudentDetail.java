import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetail {
    // Method to print each student detail
    private static void printInfo(int students, ArrayList<String[]> studentDetails) {
        // print information
        System.out.println("Student Directory:");
        System.out.println("FirstName LastName Age");
        for (int i = 0; i < students; i++) {
            String[] student = studentDetails.get(i);
            System.out.printf("%s %s %s \n", student[0], student[1], student[2]);
        }
    }

    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Variable initialization
        ArrayList<String[]> studentDetails = new ArrayList<>();
        // Ask number of student
        System.out.println("How many students are there?");
        int students = input.nextInt();
        // Ask to enter detail
        System.out.println("Enter Student Detail (FirstName-LastName-Age)");
        int i = 0;
        while (i < students) {
            String[] student = input.next().split("-");
            studentDetails.add(student);
            i += 1;
            System.out.println(i);
        }
        // Print student detail
        printInfo(students, studentDetails);
    }
}
