//Question 2: Finish the following code sothat it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
import java.util.Scanner;
public class Practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your body Temperature: ");
        double temp = scanner.nextDouble();
        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}

