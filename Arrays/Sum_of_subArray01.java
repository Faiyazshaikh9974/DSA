public class Sum_of_subArray01 {


    public static void sumOfSum_Array(int nums[]){
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                currentSum =0;
                for(int k =i; k<=j; k++){
                    currentSum += nums[k];
                }

                if(max< currentSum){
                    max = currentSum;
                }

                System.out.println(currentSum);
            }
        }
        System.out.println("Maximum of sub Array is: "+ max);
    }

    //t


    public static void main(String[] args) {

        int nums[]= {2,4,6,8,10};

        sumOfSum_Array(nums);
        



    }
}
