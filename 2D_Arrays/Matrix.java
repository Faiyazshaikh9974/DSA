import java.util.*;


public class Matrix {

    public static int findfromMatrix(int arr[][]){

        int max = 0;
        int min = arr[0][0]; //consider fist Element as Smallest Element...

         for(int i=0; i<arr.length; i++ ){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j]; 
                }else if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            
        }
        System.out.println(min);

        return max;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];

        //rows * colms means 4*3 is the number of cells you will get 
        int n = matrix.length; int m = matrix[0].length; //this is how we can get the length of N or M 
        for(int i=0; i<n; i++ ){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

         for(int i=0; i<n; i++ ){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(findfromMatrix(matrix));

    }
}
