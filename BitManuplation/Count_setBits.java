public class Count_setBits {


    public static int countSetBits(int n){
        int count = 0;
        while( n > 0){ //time Complexity is O(log n) because we are dividing the number by 2 in each iteration
            if((n & 1) == 1){ //we compare our LSB with 1
                count++; //if LSB is 1 then we increase the count by 1
            }
            n = n >> 1; //right shift the number by 1 to check the next bit
            
        }

        return count;

    }

    public static int fastExpo(int n, int p){
        int ans = 1;
        while(n > 0){
            if((p&1) !=0){
                ans = n * ans; //if LSB is 1 then we multiply the ans with n
            }

            n = n*n; //square the n
             
            p = p >> 1; //right shift the power by 1 to check the next bit
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
        System.out.println(fastExpo(5, 3));

    }
    
}
