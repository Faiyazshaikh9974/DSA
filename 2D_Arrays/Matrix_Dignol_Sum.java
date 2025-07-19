public class Matrix_Dignol_Sum{

     public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
           sum += mat[i][i];

           //check if i is not equal to mat.length-1 - i
           if( i!= mat.length-1 -i ){
            int j = mat.length - 1 - i;
           sum+= mat[i][j];
           }
           
        }

        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}