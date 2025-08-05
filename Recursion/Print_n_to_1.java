public class Print_n_to_1 {

    public static void printNum(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNum(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }

        
        System.out.println(n);
        printInc(n - 1);
    }


    public static int factorial(int n){
        if(n ==0){
            return 1;
        }
        int fac = factorial(n-1);
        int result = n * fac;
        return result; //time complexity is O(n) and space complexity is O(n)
    }

    public static int sumofNatural(int n){
        if(n == 1){
            return 1;
        }
        int sm = sumofNatural(n-1);
        int result = n + sm;
        return result;  //time complexity is O(n) and 
        //space complexity is O(n) because every recursive call is store in the stack and variable are multipe
    }
    public static void main(String[] args) {

        printInc(5);
    }
}
