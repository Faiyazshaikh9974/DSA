public class Get_I_th_BIT {
    
    public static int getIthBit(int n, int i){
        int Bitmark = 1 << i;
        if((n & Bitmark) == 0){
            return 0; // Return 0 if the ith bit is not set
        }else{
            return 1;
        }
    }

    //update the ith Bit to 1 

    public static int setIthBit(int n, int i){
        int Bitmark = 1 << i;
        return n | Bitmark; // Use OR operator to set the ith bit
    };

    //clearIth Bit to 0//

    public static int clearIthBit(int n, int i){
        int Bitmask  = ~(1 << i); //1 <<i  target the ith bit and Not operator change the Bit 
        return n & Bitmask; // Use AND operator with NOT to clear the ith bit
        //n = 10 = 1010
        //i = 1  1<<1 = 0101 - 11111010
                            //&00001010
                            // 00001000      


    }

    //update the ith Bit to 0 or 1 

    public static int updateIthBit(int n, int i, int bitValue){
        // if(bitValue == 0 ){
        //     return clearIthBit(n, i);
        // }else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i); // Clear the ith bit first
        int Bitmask = bitValue << i;
        return n | Bitmask;
    }

    //Clear Ith Numbers of Bits
    
    public static int ClearIthNumsBits(int n, int i){
        int Bitmask = -1<<i; //left shift shift i th bits left to right
        return n & Bitmask;
    }

    public static int ClearRangeofBits(int n, int i, int j){
        int a = (~0)<<(j + 1); int b = (1<<i) -1;
        int Bitmask = a | b;
        return n & Bitmask;
    }

    //check if a number is power of two...
    public static boolean isPowerOfTwo(int n){
        if((n & n-1) == 0){ //remember that n & n-1 will be 0 if n is a power of two
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(10)); 
    }
}
