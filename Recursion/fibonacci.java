public class fibonacci {

    public static int fibonaccinum(int n){
        if(n ==0 || n ==1){
            return n;
        }

        int fib1 = fibonaccinum(n-1);
        int fib2 = fibonaccinum(n-2);
        int result = fib1 + fib2;
        return result; //time complexity is O(2^n) and space complexity is O(n) because every recursive call is stored in the stack
    }

    public static void main(String[] args) {
        System.out.println(fibonaccinum(7)); // Output: 55
    }
}