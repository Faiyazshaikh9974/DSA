public class Kadane_Algo{

    public static void Kadanes_maxofSubArray(int nums[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currentSum+= nums[i];

            //check if currentSum is Less then Zero
            if(currentSum < 0){
                currentSum = 0;
            }

            //check if the CurrentSum is Greather than MaxSum 
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        System.out.println("Max of Sub Array is "+ maxSum);
    }

    public static void main(String[] args) {

        int arr [] = {-2,-3,4,-6,1,5,-3};
        Kadanes_maxofSubArray(arr);

    }
    
}