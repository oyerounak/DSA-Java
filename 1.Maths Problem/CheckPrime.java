//Chcek if anumber is prime https://practice.geeksforgeeks.org/problems/prime-number2314/1
public class CheckPrime {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(prime(n));

        CheckPrime pr = new CheckPrime(); // Creating Instance of Class
        System.out.println(pr.isPrime(n)); // Accessing non-static method with n as argument

    }

    public static boolean prime(int n) {
        boolean isPrime = true;
        if (n == 2)
            return isPrime;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    // Optimised Time complexity -O(sqrt(n))
    public boolean isPrime(int n) { // its a non-static function with n as parameter
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
