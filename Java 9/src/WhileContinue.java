public class WhileContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        // Skipping number in execution
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue;
            }
            // System.out.println(number);
            sum += number;
        }

        //Print output
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
