public class Characters {
    public static void main(String[] args) {
        // define character
        char x = 65;
        char y = '4';
        char z = '\u0069';

        // Print characters
        System.out.println("65 : " + x);
        System.out.println("++65 : " + ++x);
        System.out.println("4 : " + y);
        System.out.printf("\\u0069 : %c", z);
    }
}
