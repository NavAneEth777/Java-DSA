public class SearchInSortedMatrix{
    
    public static boolean StaircaseSearch1(int matrix[][], int key) {
        // staircase search from 32
        int row = matrix.length-1; int col = 0;

        while (row >=0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at: " + "(" + row + "," + col + ")");
                return true;
            }
            else if ( key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static boolean StaircaseSearch2(int matrix[][], int key) {
        //Staircase search from 40
        int row = 0; int col = matrix[0].length-1;

        while (row < matrix.length && col>=0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at: " + "(" + row + "," + col + ")");
                return true;
            }
            else if ( key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = {  {10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50} };
        int key = 33;
        StaircaseSearch1(matrix, key);
        StaircaseSearch2(matrix, key);
    }
}