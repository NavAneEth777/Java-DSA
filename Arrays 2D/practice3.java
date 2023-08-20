public class practice3 {
    
    public static void transposeMatrix(int matrix[][]) {

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 2; int cols = 3;
        int matrix[][] = {{2,3,4}, {5,6,7}};
        
        //print matrix
        transposeMatrix(matrix);

        //transpose the matrix
        int[][] transpose = new int[cols][rows];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        transposeMatrix(transpose);
    }
}
