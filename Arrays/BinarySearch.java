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




