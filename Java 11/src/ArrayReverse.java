public class ArrayReverse {
    private static void print(String text, int[] values) {
        System.out.println(text);
        for (int value : values) {
            System.out.printf("%d ", value);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {40, 50, 60, 70};
        // Find mid point
        double midPoint = Math.ceil(values.length / 2);
        // Before
        print("Before:", values);
        // Reverse order
        for (int i = 0; i < midPoint; i++) {
            int temp = values[i];
            values[i] = values[values.length - i - 1];
            values[values.length - i - 1] = temp;
        }
        // After
        print("After:", values);
    }
}
