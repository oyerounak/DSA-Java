public class BionomialCoefficient {

    // nCr = n!/r!(n-r)!
    public static void main(String[] args) {
        int n = 5, r = 3;
        System.out.println(Binomial(n, r));
 
    }

    public static int Binomial(int n, int r) {
        int factOfN = factorial(n);
        int factOfR = factorial(r);
        int factOfNminusR = factorial(n - r);

        int value = factOfN / (factOfR * factOfNminusR);
        return value;

    }

    public static int factorial(int n) {
        int factValue = 1;

        for (int i = 1; i <= n; i++) {
            factValue = factValue * i;
        }
        return factValue;

    }
}
