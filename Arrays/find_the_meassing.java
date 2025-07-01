public class find_the_meassing {

    public static int missingNumber(int[] nums) {
        int currentSum = 0;
        int exactSum = 0;
        for(int i=0; i <nums.length ; i++){
            currentSum += nums[i];
            exactSum = exactSum + (i + 1);
        }


        return exactSum - currentSum;
        
    }

    public static void main(String[] args) {

        int arr[] = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}
