public class Printlargeststring {
    public static void main(String[] args) { //.equals fuction checks the given string is equal or not.
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i=0; i<fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) { // compareToIgnorecase is A == a.
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
