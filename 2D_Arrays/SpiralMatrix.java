public class SpiralMatrix {

    public static void printMatrix(int Matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = Matrix.length - 1;
        int endCol = Matrix[0].length - 1;

        // create a while loop and check the base condition

        while (startRow <= endRow && startCol <= endCol) {

            // top part

            for (int j = startCol; j<= endCol; j++) {
                System.out.print(Matrix[startRow][j] + " ");
            }

            //righ
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Matrix[i][endCol] + " ");

            }

            //bottom 
            if(startRow < endRow){
            for(int j= endCol -1 ; j>=startCol; j-- ){
                System.out.print(Matrix[endRow][j]+ " ");

            }
        }

            //left
            if(startCol < endCol){
            for(int i=endRow -1; i>=startRow+1; i--){
                System.out.print(Matrix[i][startCol ] + " ");
            }
        };

            startRow++;
            endRow--;
            startCol ++ ;
            endCol --;
        }
    }

    public static void main(String[] args) {
        int Matrix[][] = {
                { 1,2,3},
                { 4, 5 ,6},
                { 7,8,9},
                { 10,11,12} };
        printMatrix(Matrix);
    }
}
