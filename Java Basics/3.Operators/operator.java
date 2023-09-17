import java.io.IOException;
import java.util.*;

public class operator {
    public static void main(String[] args) throws IOException {
        //1 Arithmetic operators (+,-,/,*)
        int x = 10, y = 20, z;
        z = x + (y * 10);
        System.out.println(z);

        z = x++;
        System.out.println(z + " " + x);
        z = ++x;
        System.out.println(z + " " + x);

        //2 Assignment Operator (=,+=,-=,*=,%=,/=)
        int a = 10, b = 5, c;
        c = a = b; // here a will get value of b and then c will get value of c
        a += a;
        System.out.println(c+" "+a); //Output : 5  10

        //3 Bitwise Operator (|,^,&,~) It takes Binary input of number entered perform operation and gives output
        int d = 3, e = 6; 
        System.out.println(d & e);//Bitwise AND
        System.out.println(d|e);//Bitwise OR
        System.out.println(d^e);//Bitwise XOR
        System.out.println(~d); //Bitwise Complement

        //4 Ternary Operator(a ? b : c)
        //Syntax : variable = Expression1 ? Expression2: Expression3
        int max = (d>e) ? d : e;
        System.out.println(max);

        //5 Relational Operator(==,>=,<=,!=,<,>) It return Boolean value
        int var1 = 30, var2 = 20, var3 = 5;
        System.out.println("var1 > var2: " + (var1 > var2));
        System.out.println("var1 > var2: " + (var1 >= var2));
        System.out.println("var1 > var2: " + (var1 <= var2));
        System.out.println("var1 > var2: " + (var1 != var2));
        System.out.println("var1 > var2: " + (var1 == var2));
        System.out.println("var1 > var2: " + (var1 < var2));

        //6 Logical Operator(&&, ||, !) 
        boolean var4 = true;
        boolean var5 = false;
 
        System.out.println("a: " + var4);
        System.out.println("b: " + var5);
        System.out.println("a && b: " + (var4 && var5));
        System.out.println("a || b: " + (var4 || var5));
        System.out.println("!a: " + !var4);
        System.out.println("!b: " + !var5);

        


    }

}
