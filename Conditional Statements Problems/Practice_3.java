//Question 3: Write a Java program to input week number (1-7) and print day of week name using switch case
import java.util.Scanner;
public class Practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date in a week (1-7): ");
        int week = scanner.nextInt();
        switch (week) {
            case 1: System.out.println("Day: MONDAY!"); break;
            case 2: System.out.println("Day: TUESDAY!"); break;
            case 3: System.out.println("Day: WEDNESDAY!"); break;
            case 4: System.out.println("Day: THRUSDAY!"); break;
            case 5: System.out.println("Day: FRIDAY!"); break;
            case 6: System.out.println("Day: SATURDAY!"); break;
            case 7: System.out.println("Day: SUNDAY!"); break;
            default: System.out.println("Invalid Date!");
        }
    }
}
