public class p4 {
    public static void pattern(int n) {
        int counter = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                counter++;
                System.out.print(counter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
