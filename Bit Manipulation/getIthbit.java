/* 
 * to understand get ith bit let's take an example
 * for 10: 1010 i want 2nd bit 
 * so in 1010 2nd bit is '0'.
 * for this we have to do 1<<i {1 leftshift i} and same as even or odd.
 */

public class getIthbit {
    
    public static int getithbit(int n, int i) {
        int bitmask = 1;
        if ((n & bitmask<<i) == 0) {
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10, 2));
    }
}
