public class Get_I_th_BIT {
    
    public static int getIthBit(int n, int i){
        int Bitmark = 1 << i;
        if((n & Bitmark) == 0){
            return 0; // Return 0 if the ith bit is not set
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 5)); // Output: 1
    }
}
