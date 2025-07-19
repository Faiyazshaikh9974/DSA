public class checkEvenOdd {

    public static void EvenOdd(int n) {
        if ((n & 1) == 0) { // 1 represent in Binary like is 001 & 101 //remember one thing the Odd Number
                            // Always Have one on first Right number and if it's not there it means it's
                            // even Number
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        EvenOdd(5);
        EvenOdd(4);
        EvenOdd(3);

    }

}
