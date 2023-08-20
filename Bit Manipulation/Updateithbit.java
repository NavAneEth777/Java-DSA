// update means combination of clear and set. we have to use both clear and set functions.
public class Updateithbit {
    
    public static int clearithbit(int n, int i) { // clear ith bit
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static int Setithbit(int n, int i) { // set ith bit
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int updateithbit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearithbit(n, i);
        } else {
            return Setithbit(n, i);
        }

    }

    public static void main(String[] args) {
        System.out.println(updateithbit(10, 1, 0));
    }
}
