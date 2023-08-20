import java.util.Scanner;

public class basicStrings {
    
    public static void printletters(String str22); {
        for (int i=0; i<str22.length(); i++) {
            System.out.print(str22.charAt(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd', 'e'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // String str22 = "ALLURI NAVANEETH";
        // printletters(str22);
        StringBuilder sb = new StringBuilder("");
        for (char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);

    
    }
}
