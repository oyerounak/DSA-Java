public class TwoClass {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Example : 1
        // Accessing a non-static variable outside TwoClass.
        Add abc = new Add(); // Creating Instance of that class to access non-static variable.
        int sum = abc.Addition(a, b);
        System.out.println("Sum of " + a + " and " + b + " : " + sum);

        // Example : 2
        // Accessing a static variable outside TwoClass.
        int minus = Sub.substract(a, b);
        System.out.println("Substraction of " + a + " and " + b + " : " + minus);

        // Example : 3
        // Accessing a non-static variable inside Twoclass.
        TwoClass multi = new TwoClass(); // creating instance of same class to access method
        double pro = multi.product(a, b);
        System.out.println("Product of " + a + " and " + b + " : " + pro);

        // Example : 4
        // Accessing a static variable Inside TwoClass.
        double val = Div(a, b);
        System.out.println("Division of " + a + " and " + b + " : " + val);

    }

    public double product(int x, int y) {
        return x * y;
    }

    public static double Div(int x, int y) {
        return x / y;
    }
}

class Add {
    public int Addition(int x, int y) { // non-static method
        int sum = x + y;
        return sum;

    }

}

class Sub {
    public static int substract(int x, int y) { // static method
        int minus = x - y;
        return minus;
    }
}
/*
 * Notes
 * 1. If main method is in public class or default class then no other class can
 * be public.
 * 2. In a java file you can have only one public class.
 * 3. Instance of a class is called object.
 */
