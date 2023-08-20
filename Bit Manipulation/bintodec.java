/* 
 * here we can see how the numbers i.e {0,1,2,3,4,5,6,7,8,9} changes to binary numbers
 * computer stores our data in binary format (bun means 2- {0&1})
 * converting decimal(number) to binary:
    * ex: 4, take LCM we get {0, 0, 1} 1 as remainder
    * now shift 1 to the front of zeros..
    * binary form of number 4 is: 100.

 * converting binary to decimal i.e {100 to 4}:
    * take the binary form and multiply each number with 2^i {i means 3 {starting from 0} incase of 4}
    * and add it.
    * 100 = {1 * 2^2 + 0 * 2^1 + 0 * 2^0} which gives 4.

 * we should remember the binary form upto number 8:
 * 0 - 000
 * 1 - 001
 * 2 - 010
 * 3 - 011
 * 4 - 100
 * 5 - 101
 * 6 - 110
 * 7 - 111
 * 8 - 1000

 * Bitwise opearators!
 * AND (&), OR (|), XOR (^), Binary one's compliment(NOT) (~), left shift (<<), right shift (>>).
 * if you want truth table of above operators once refer apna college or internet.
 */
public class bintodec {
    public static void main(String[] args) {
        // AND operator
        System.out.println((5&6)); // & is different from && {&- for bit operator/ &&- for And condition}
        // OR operator
        System.out.println((5|6));
        // XOR operator {NOT + OR}
        System.out.println((5^6));
        // Binary one's compliment(NOT)
        System.out.println((~5)); // plzz refer apna college video there is more to see if you forgot.
        // left shift {formula: a<<b = a * 2^b(2 ki power)}
        System.out.println((5<<2));
        // right shift {formula: a>>b = a / 2^b(2 ki power)}
        System.out.println((6>>1));
    }
}
