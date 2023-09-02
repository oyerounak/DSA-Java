import java.io.IOException;
import java.util.*;

public class ScannerClass {

    public static void main(String[] args)throws IOException{
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


    }
    
}
