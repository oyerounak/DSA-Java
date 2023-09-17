//Count primes in range - https://practice.geeksforgeeks.org/problems/count-primes-in-range1604/1
public class PrimeinRange {
    public static void main(String[] args) {
        int a = 10, b = 35;
        number(a, b);Integer.parseInt(null, a);
    }

    public static void number(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

}
