public class Linear {
    public static void main(String[] args){
        int arr[] = {22,14,15,22,25,58,20,19,18};

        int largest = arr[0];

        for(int i=0; i<arr.length; i++ ){
            largest = Math.max(arr[i], largest);
        }

        System.out.println(largest);
    }

}
