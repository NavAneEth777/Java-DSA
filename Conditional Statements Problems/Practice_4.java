//Question 5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.Scanner;
public class Practice_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.print(year + " is a leap year");
        } else {
            System.out.print(year + " is not a leap year");
        }
    }
    
}
