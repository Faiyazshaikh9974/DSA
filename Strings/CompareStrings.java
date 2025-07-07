import java.util.*;
public class CompareStrings {

    
    
    public static void main(String[] args){
        String arr[] = {"Apple", "mango", "Banana"};

        String largest = arr[0];
        for(int i=1; i<arr.length; i++){
            //compareTo function return 0 when value is equal and >0 value when element is smaller and <0 means value is largest
            if(largest.compareToIgnoreCase(arr[i]) < 0){
                largest = arr[i];
            }
        }

        //this is how compareto function return the value and compareToIgnorecase is used to 
        //ingnore case "a" and "A" both are equaly count..
        // str1 < star2 == <0 less then zero
        // str1 > star2 == >0 greather than zero
        // str1 == str2 ==  0 

        System.out.println(largest);

    
    }
}
