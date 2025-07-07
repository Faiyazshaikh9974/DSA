package Strings;

public class isPalidrome {
    public static boolean isStringPalidrome(String str){
         for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            } //time complexity is O(n) beacause loop runs zero to n times..
            
        }

        return true;
    }


    public static void main(String[] args){

        String str = "noon";

        System.err.println(isStringPalidrome(str));

       
    
}
    
}
