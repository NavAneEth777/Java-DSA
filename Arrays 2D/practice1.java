public class practice1 {
    
    public static int repeatedNumber(int matrix[][], int key) { // time complexity- O(n^2)
        int result = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    result++;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8}, {8,8,7}};
        int key = 7;
        System.out.println(repeatedNumber(matrix, key));
    }
    
}
