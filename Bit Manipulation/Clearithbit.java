/*
 * to understand this set ith bit let's take an example:
 * for 10 = 1010 and we want 1st bit = 0 {1000}
 * take NOT function with left shift = ~(1<<i)
 */
public class Clearithbit {
    public static int clearithbit(int n, int i) {
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static void main(String[] args) {
        System.out.println(clearithbit(10, 1));
    }
}
