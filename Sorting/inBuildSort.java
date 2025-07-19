import java.util.*;

public interface inBuildSort {
    
    public static void main(String[] args) {
        Integer arr [] = {1,5,3,7,8,9,10};

        Arrays.sort(arr, 0, 4, Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
