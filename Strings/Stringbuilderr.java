/*  StringBuilder is used to decrease the time complexity
    in string function it takes O(26 * n^2) time complexity bcuz it all ways
    copies the original one to create new string, but in StringBuilder it won't copy
    the original one time complexity- O(26). 
    see code below for better understanding */

    public class Stringbuilderr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}