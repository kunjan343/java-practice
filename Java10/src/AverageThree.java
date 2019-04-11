public class AverageThree {
    private static boolean Average(int p1, int p2, int p3) {
        // Create int array to store value;
        int[] series = new int[]{p1, p2, p3};
        // Sort array ascending
        for (int i = 0; i < series.length; i++) {
            for (int j = i; j < series.length; j++) {
                // Swapping values
                if (series[i] > series[j]) {
                    int temp = series[i];
                    series[i] = series[j];
                    series[j] = temp;
                }
            }
        }
        // Find average
        double avg = (double) (series[0] + series[2]) / 2;
        // Return boolean result
        return avg == series[1];
    }

    public static void main(String[] args) {
        // True case
        boolean answer = Average(6, 8, 4);
        System.out.println("6 8 4: " + answer);
        // False case
        answer = Average(2, 5, 7);
        System.out.println("2 5 7: " + answer);
    }
}
