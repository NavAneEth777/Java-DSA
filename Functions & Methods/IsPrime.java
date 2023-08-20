public class IsPrime {
    public static boolean IsPrime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(IsPrime(4));
    }
}
