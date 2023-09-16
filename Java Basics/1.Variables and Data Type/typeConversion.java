import java.io.IOException;

public class typeConversion {
    public static void main(String[] args) throws IOException {

        // Using Wrapper object
        Integer ir = new Integer(90);
        System.out.println(ir);

        // Autoboxing and Unboxing
        int x1 = 10;
        Integer x2 = x1; // Autoboxing
        int x3 = x2; // Auto-Unboxing

        // Implicit Conversion
        int x = 10;
        long y = x; // int to long
        float z = y; // long to float

        System.out.println(x + " " + y + " " + z);
        System.out.println();

        // Explicit Conversion
        double a = 65.47867d;
        int b = (int) a; // double to int
        char c = (char) b; // int to char

        Integer d = new Integer(9);
        int e = d.valueOf(d); // Integer to int
        float f = d.valueOf(e); // Integer to float
        String g = Integer.toString(d); // int to String
        Integer h = Integer.valueOf(e); // int to Integer
        int i = Integer.parseInt(g); // String to int
        Integer j = Integer.valueOf(g); // String to Integer
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

    }
}
