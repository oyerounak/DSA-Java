import java.io.IOException;
import java.lang.Math;

public class Output {

    public static void main(String[] args) throws IOException {

        int x = 100, y = 200;
        
        //Printing
        System.out.print("Hello ");
        System.out.print("Buddy\n"); // \n for line change
        // output : Hello Buddy
        System.out.println("Whats Up");
        // output : Whats Up
        
        //Escape Sequence
        System.out.println("Welcome to \"VS Code\""); // output : Welcome to "VS Code" (\ is called performing escape Sequence)
        System.out.println("Hi, \nWelcome Back");
          /*output : Hi,
                     Welcome Back 
        */
        System.out.println("Print Path : C:\\xyz\\abc.txt"); // output : Print Path : C:\xyz\abc.txt
        System.out.println("Hello \tGo away"); //output : Hello   Go away
        
        //Formatting
        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.2f\n", Math.PI); // output : 3.14
        System.out.printf("%.4f\n", pi); // \n is mandatory for line change (output : 3.1416)
        System.out.printf("%.3f\n", pi); // output : 3.142
        System.out.printf("%7.2f\n", pi); // output : ---3.14
        System.out.printf("%07.2f\n", pi); // output : 0003.14
        System.out.printf("Value of x is %d\n",x); //output : Value of x is 100
        System.out.printf("x=%d , y=%d", x, y); // output : x=100 , y=200

    }

}
