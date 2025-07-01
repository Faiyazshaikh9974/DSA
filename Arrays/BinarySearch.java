public class BinarySearch {
    public static int BinarySearch(int nums[], int key){

        int start = 0;
        int end = nums.length - 1;

        while(start<= end){
            int med = (start + end) /2 ;

            if(nums[med] == key){
                return med;
            }if(nums[med] < key){
                start = med + 1;
            }else {
                end = med - 1 ;
            }
        }

        return -1;


    }


    public static void main(String[] args) {
        int arr[] = {20,22,24,25,26,88,45,40,30};
        int key = 25;

        System.out.println("Index of Key is: " + BinarySearch(arr, key));
    }
}




class Solution {
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