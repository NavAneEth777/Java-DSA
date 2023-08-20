import java.util.Scanner;
public class prblm3 {
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;
        while(palindrome != 0) {
            int remainder = palindrome % 10;
            reverse *= 10 + remainder;
            palindrome /= 10;
        }
        if (palindrome == reverse) {
            return true;
        } return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }
}
