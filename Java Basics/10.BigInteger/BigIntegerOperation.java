import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerOperation {
    public static void main(String[] args) {
        //initialization of Big Integer 
        BigInteger A = new BigInteger("876");
        String str = "987";
        BigInteger B = new BigInteger(str);
        int c = 9876;
        BigInteger C = BigInteger.valueOf(c);

        System.out.println(A+" "+" "+B+" "+C);
        //Calculation
        A.add(B);
        A.subtract(B);
        A.multiply(B);
        A.divide(B);
        A.remainder(B);

        //Compare two bigInteger
        System.out.println(A.compareTo(B)); //return integer value a>b=1, a<b=-1, a==b = 0

        //Conversion
        int n = C.intValue();
        long l = A.longValue();
        String s = A.toString();
        System.out.println(n+" "+l+" "+s);



    }
    
}
