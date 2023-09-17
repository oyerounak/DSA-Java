public class FunctionOverload {

    /*
     * Function Overloading - Multiple functions with same name but different
     * paameters.
     * 1.Overloading using parameters
     * 2.Overloading using Data types
     */
    public static void main(String[] args) {
        System.out.println(Sum(1, 2, 3)); // actual parameter or arguments exist in function call.
        System.out.println(Sum(16, 18));
        System.out.println(Sum(12.98f, 16.45f));

    }

    // Overloading using parameters
    public static int Sum(int a, int b) { // formal Parameter or parameters exist in function
        return a + b;
    }

    // Overloading using parameters
    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading using Data types
    public static float Sum(float a, float b) {
        return a + b;
    }

}
