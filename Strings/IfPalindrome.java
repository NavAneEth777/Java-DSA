public class IfPalindrome {
    
    public static boolean isPalindrome(String str) { // time complexity- O(n).
        for (int i=0; i<str.length(); i++) {
            int j = str.length() - i - 1;
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "RACECAR";
        String str2 = "NOON";
        String str3 = "madam";
        System.out.println(isPalindrome(str));
    }
}