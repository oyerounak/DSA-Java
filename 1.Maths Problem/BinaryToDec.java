//Binary to Decimal - https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1
public class BinaryToDec {
    public static void main(String[] args) {

        System.out.println(binary_to_decimal("110001"));

    }

    public static int binary_to_decimal(String a) {
        // Code here
        long n = Long.parseLong(a);
        int po = 0;
        long dec = 0;
        while (n > 0) {
            long LD = n % 10;
            dec = dec + (LD * (int) Math.pow(2, po));
            n = n / 10;
            po++;
        }
        return (int) dec;
    }

}
