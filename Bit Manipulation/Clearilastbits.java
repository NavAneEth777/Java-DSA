/*
 * in this clear i last bits let's take an example to understand.
 * for 15: 1111 and i=1 so the answer should be (1100)
 * so bit mask is (~0)<<i and taking and(&) with n
 * note: negation of 0 is: -1 {111111} taking leftshift: 111100000.
 */
public class Clearilastbits {
    public static int clearilastbits(int n, int i) {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearilastbits(15, 2));
    }
}
