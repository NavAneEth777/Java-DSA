/*
 * to understand this set ith bit let's take an example:
 * for 10 = 1010 and we want 2nd bit = 1 {1110}
 * same as get ith bit but in place of AND take OR operator.
 */

import java.util.Set;

public class Setithbit {
    public static int Setithbit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(Setithbit(10, 2));
    }
}
