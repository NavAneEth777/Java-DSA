public class Setbitsinnumber {
    public static int countsetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countsetbits(10));
    }
}