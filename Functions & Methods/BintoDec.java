public class BintoDec {
    public static void BintodDec(int BinNum) {
        int myNum = BinNum;
        int pow = 0;
        int DecNum = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum % 10;
            DecNum += lastdigit * Math.pow(2, pow);
            pow++;
            BinNum /= 10;
        }
        System.out.println(myNum + " = " + DecNum);
    }
    public static void main(String args[]) {
        BintodDec(101);
    }
}
