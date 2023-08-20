import java.util.Scanner;
/*
 * Question2: In a program, input the side of a square. You have to output the area of the square. 
 * (Hint : area of a square is (side x side))
 */
public class Practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of a square: ");
        int side = scanner.nextInt();
        int area = side * side;
        System.out.print("Area of Square: " + area);

    }
}
