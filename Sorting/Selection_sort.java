package Sorting;

public class Selection_sort {
    
    public static void Selection_sort_alogirtham(int nums[]){  //intput {4,2,6,1};  {1,2,6,4}, {1,2,4,6}

        //outer loop run from zero to n-1 
        for(int i=0; i<nums.length-1; i++){
            //assign nums index value of i to minIndex...
            int minIndex = i; //0 value           initialy value is 0,  
            for(int j=i+1; j<nums.length; j++){                //inner loop run from i + 1 = 1 to 
                if(nums[j] < nums[minIndex]){                  //condition check if nums[j] is less then nums[minIndex] - 2 < 4 it's true so the
                    minIndex = j;                              //midindex is now index - 1 means 2  - 6<2 -not true 1<2 true - minindex = j - 3
                };
            }

            int temp = nums[minIndex];      //temp = 3
            nums[minIndex] = nums[i];   //nums[3] == nums[i] 
            nums[i] = temp;             //nums[i] == 1 , nums[3] == 4



        }
    }

    public static void PrintArray(int nums[]){
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int arr [] = {4,2,6,1};
        Selection_sort_alogirtham(arr);
        PrintArray(arr);
        

        
    }
}
