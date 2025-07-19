public class Search_in_sorted_Matrix {

    public static boolean SearchinMatrix(int Matrix[][], int key){
        // for(int i=0; i<Matrix.length; i++){
        //     for(int j=0; j<Matrix[0].length; j++){
        //        if(Matrix[i][j] == key){
        //         System.out.println("Key Found At Index No: " + i + "," + j);
        //         return true;
        //        }
        //     }
           
        // }
        // System.out.println("Key Not Found");

        // return false;

        int row = Matrix.length-1; int col =0;
        
        while(col < Matrix.length && col >= 0){
            if(Matrix[row][col] == key){
                System.out.print("Key Found at (" + row + "," + col +")");
                return true;
            }else if(key < Matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }

        System.out.println("Key Not Found " );
        return false;
    }

    public static void main(String[] args) {

        int Matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        
        SearchinMatrix(Matrix, 33);
        
    }
}
