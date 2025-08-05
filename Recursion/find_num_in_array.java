public class find_num_in_array {

    public static int findNum(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return findNum(arr, key, i + 1);
    }

    public static int lastOccurance(int[] arr, int key, int i) {

        if (i == arr.length) {  //base condition
            return -1;
        }

        int num = lastOccurance(arr, key, i + 1); //get the first occurance 

        if (num != -1) {
            return num;
        }

        if(arr[i] == key){
            return i;
        }

        return num;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,5,8,5,10,11,12,15,5};
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
