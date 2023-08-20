public class OddorEven {
    public static void Oddoreven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            System.out.println("Odd number");
        } else {
            System.out.println("even number");
        }
    }
    public static void main(String[] args) {
        Oddoreven(4);
        Oddoreven(11);
    }
}
