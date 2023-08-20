import java.util.Scanner;
public class prblm1 {
    public static int avg(int a, int b, int c) {
        int avg1 =  (a+b+c) / 3;
        System.out.println("avg of three numbers: " + avg1);
        return avg1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        avg(a,b,c);
    }
}
