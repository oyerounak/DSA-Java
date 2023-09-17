import java.io.*;
import java.util.*;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int b = sc.nextInt();
        float c = sc.nextFloat();
        char d = sc.next().charAt(0);
        long l = sc.nextLong();
        short s = sc.nextShort();
        System.out.println("===============");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(l);
        System.out.println(s);

        // Reading file
        try {
            File fr = new File("C:\\Java Basics\\Input and Output\\file.txt");
            Scanner sc1 = new Scanner(fr);

            // Using LOOP
            while (sc1.hasNextLine()) {
                System.out.println(sc1.nextLine());
            }

            // Without using loop
            // sc1.useDelimiter("\\Z");
            // System.out.println(sc1.next());
        } catch (FileNotFoundException e) {
            System.err.println("File not found by system: " + e.getMessage());
        }

    }
}
