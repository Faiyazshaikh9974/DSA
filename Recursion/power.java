public record power() {

    public static int powerof(int x, int n){
        if(n == 0){
            return 1;
        }

        return x * powerof(x, n - 1 );
    }

    //efficient way to calculate power with O(log n) time Complexity

    public static int efficientpowerCal(int x, int n){
        if(n == 0){
            return 1;

        }

        int halfpower = efficientpowerCal(x, n/2);

        int halfpowersqr = halfpower * halfpower;

        if(n%2 != 0){
            halfpowersqr = x * halfpowersqr;
        }
        
        return halfpowersqr;
    }

    public static void main(String[] args) {
        System.out.println(efficientpowerCal(2, 10));


    }
}
