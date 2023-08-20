public class p1 {
    public static void Hollow_Rectangle(int totalRows, int totalCols) {
        // 1st loop
        for (int i=1; i<=totalRows; i++) {
            //inner rows
            for (int j=1; j<=totalCols; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else { 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Hollow_Rectangle(10, 10);
    }
}
