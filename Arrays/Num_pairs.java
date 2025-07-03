public class Num_pairs {

    public static void PrintPairs(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    System.out.print("(" + nums[i] + "," + nums[j] + ")");
                    count++;
                }

            }

            System.out.println();
        }
        System.out.println(count);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 1, 3 };

        PrintPairs(arr);

    }
}