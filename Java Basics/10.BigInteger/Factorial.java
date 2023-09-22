import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int str= 15;
        System.out.println(CalculateFactorial(str));
    }
    public static BigInteger CalculateFactorial(int n){
        BigInteger N = new BigInteger("1");
        for(int i=2;i<=n;i++){
            BigInteger x= BigInteger.valueOf(i);
            N = N.multiply(x);
        }
        return N;
        

    }

    
}
