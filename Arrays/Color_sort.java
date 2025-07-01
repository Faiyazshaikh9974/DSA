public class Color_sort {
    
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length -1 ;
        while(i<=k){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }

            if(nums[i] == 2){
                int temp2 = nums[i];
                nums[i] = nums[k];
                nums[k] = temp2;
                k--;
            }else {
                i++;
           }
        } 
    }
}

