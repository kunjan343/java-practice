import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your row matrix limit");
        int row = input.nextInt();
        System.out.println("Enter your column matrix limit");
        int column = input.nextInt();

        System.out.printf("  ");
        for (int k = 0; k < row; k++) {
            System.out.printf("%d ", k);
        }
        System.out.println("");

        for (int i = 0; i < column + 1; i++) {
            System.out.printf("%d ", i);
            for (int j = 0; j < row + 1; j++) {
                System.out.printf("%d ", i * j);
            }
            System.out.println("");
        }
    }
}
