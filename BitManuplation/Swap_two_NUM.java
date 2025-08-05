public class Swap_two_NUM {

    public static void swapTwoNumbers(int a, int b) {

        // XOR swap Algorithm
        a = a ^ b; //
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // UpperCase to Lower case a Charator

    public static char uppertoLower(char c) {
        // ASCII value of 'A' is 65 and 'a' is 97
        // A ===65 a == 97 65 ==
        System.out.println("Lowercase: " + (char) (c | 32));
        return c;
    }

    public static void main(String[] args) {
        uppertoLower('D');
    }
}
