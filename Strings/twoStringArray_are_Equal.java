public class twoStringArray_are_Equal {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstStr = "";
        for(int i=0; i<word1.length; i++){
            firstStr = (word1[i] + word1[i+1]);
        }

        System.out.println(firstStr);

        return true;
        
    }

    public static void main(String[] args) {
        String arr1 [] = {"ab", "c" }; String arr2[] = {"a", "bc"};
        twoStringArray_are_Equal obj = new twoStringArray_are_Equal();
        obj.arrayStringsAreEqual(arr1, arr2);
    }
}
