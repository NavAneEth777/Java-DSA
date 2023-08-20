import java.util.Scanner;
/*
 * Question3:
 * Enter cost of 3items from the user (usingfloatdatatype) - a pencil, a pen and an eraser.
 * You have to output the total cost of the items back to the user as their bill.
 * (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */
public class Practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //cost of pencil
        System.out.print("Enter cost of Pencil: ");
        float costpencil = scanner.nextFloat();
        //cost of pen
        System.out.print("Enter cost of Pen: ");
        float costpen = scanner.nextFloat();
        //cost of eraser
        System.out.print("Enter cost of eraser: ");
        float costeraser = scanner.nextFloat();
        //total cost of items
        float totalcost = costpencil + costpen + costeraser;
        System.out.println("Total cost of items: " + totalcost);
        //with GST
        float multiplying = totalcost * 0.18f;
        float withGST = multiplying + totalcost;
        System.out.print("Price of three items with GST: " + withGST);
    }
}
