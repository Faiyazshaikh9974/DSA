public class Bit_operators {

    public static void main(String[] args) {

        // System.out.println(5 & 6); //binary Represntation A = 101 B = 110 101 & 110
        // 100 - 0 + 1 = 0 1+ 0 =0 only 1 + 1 = 1 so that answer is (4)10

        //  | or Operator return false only when both values are false

        System.out.println(5 | 6);

        //101 + 110  1+0 = 1,  0+1 = 1,  1+1 = 1 = 111 - 7 in decimal

        //^ XOR operator return true if both value is diffrent else it's return false even if both value is greater than zero

        System.out.println(5^6);  //101 + 110  =  1+0 = 1  1+1 = 0      011  decimal  3   

    }

}
