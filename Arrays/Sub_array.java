public class Sub_array {

    public static void sub_array(int nums[]){

        for(int i = 0; i<nums.length; i++){
            for(int j =i; j<nums.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print("[" + nums[k] + "]" );
                }
                System.out.println();
            }
        } System.out.println();
    }

    public static void main(String [] args){

        int arr[] = {2,4,6,8,10};
        sub_array(arr);


    }
}
