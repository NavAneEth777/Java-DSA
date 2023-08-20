public class DiagonalSum {
    
    public static int Diagonalsum(int matrix[][]) {
        int sum = 0;
        
        //method-1 (time complexity - O(n^2))
        for (int i=0; i<matrix.length; i++) { // primary diagonal
            for (int j=0; j<matrix[0].length; j++) { // secondary diagonal
                if (i==j) {
                    sum += matrix[i][j];
                } else if (i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }

        //method-2 (time complexity - O(n))
        for (int i=0; i<matrix.length; i++) {
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if (i != matrix.length-i-1) {
                sum += matrix[i][matrix.length-i-1];
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {  {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9,10,11,12},
                            {13,14,15,16}   };
        System.out.println(Diagonalsum(matrix));
        // we get 136 b'coz method-1[68] + method-2[68] = 136
    }
}
