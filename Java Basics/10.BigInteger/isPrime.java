import java.math.BigInteger;

public class isPrime {
    //To check if a number is prime or not and check the next prime number in BigInteger
    public static void main(String[] args) {
        int n =112349;
        System.out.println(PrimeCheck(n));
        System.out.println(NextPrimeNum(n));
        
    }
    public static boolean PrimeCheck(int n){
        BigInteger b = BigInteger.valueOf(n);
        boolean res = b.isProbablePrime(n);
        return res;
    }

    public static BigInteger NextPrimeNum(int n){
        BigInteger b = BigInteger.valueOf(n);
        BigInteger str = b.nextProbablePrime();
        return str;
    }
    
    
    
}
