package Sorting;

public class Bubble_sort_algo {

    public static void BubbleSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) { // O(n)

            int sort = 0;
            for (int j = 0; j < nums.length - 1 - i; j++) { //n   now time complexity of this program is O(n2)..
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    sort++; //count the 
                }

            }

            if (sort == 0) {
                break;
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 1, 6, 8 };
        BubbleSort(arr);

    }
}
