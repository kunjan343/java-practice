public class SumMethod {


    private static int countSum(double min, int max) {
        int sum = 0;
        for (double i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1 to 10 is :" + countSum(1, 10));
        System.out.println("Sum of 20 to 30 is :" + countSum(20.5, 30));
        System.out.println("Sum of 35 to 45 is :" + countSum(35, 45));
    }
}