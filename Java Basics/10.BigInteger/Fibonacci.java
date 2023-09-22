import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        //input : 100
        //Output : 354224848179261915075
        //This value can not be kept in int value so we will be using BigInteger

        int n =100;
        BigInteger A = BigInteger.valueOf(0);
        BigInteger B = BigInteger.valueOf(1);
        BigInteger C = BigInteger.valueOf(1);
        for(int i=2;i<=n;i++){
            C = A.add(B);
            A=B;
            B=C;
        }
        System.out.println(B);
        
    }
    
}
