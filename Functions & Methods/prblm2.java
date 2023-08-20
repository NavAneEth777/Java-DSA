import java.util.Scanner;
public class prblm2 {
    public static boolean isEven(int n) {
        boolean isEven = true;
        if (n % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(4));
    }
}
