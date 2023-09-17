import java.util.Scanner;

public class ContinueInJava {
    public static void main(String[] args) {
        // Continue in for loop
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i); // Output : 0 1 2 4

        }

        for (int i = 0; i < 5; i++) {
            if (i == 1 || i == 2) {
                continue;
            }
            System.out.println(i); // Output : 0 3 4
        }

        // Continue in While loop
        int i = 0;
        while (i < 3) {
            i++; // This should be done first in while loop to avoid infinite loop
            System.out.println("Before " + i);
            if (i == 2) {
                continue;
            }
            System.out.println("After " + i);

        }
        System.out.println("  ");

        // Labeled continue
        first: for (int k = 0; k < 3; k++) {
            // Second label
            second: for (int j = 0; j < 3; j++) {
                if (k == 1 && j == 1) {

                    // Using continue statement with label skipping it
                    continue first;
                }
                System.out.println(k + " " + j);
            }
        }

        System.out.println("   ");
        int k = 0;
        while (k < 4) {
            k++;
            if (k == 2) {
                continue;
            }
            System.out.println(k);
        }

        // Program to take 5 input (x,y) and print x/y when y not equal to 0;
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 5; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0)
                continue;
            System.out.println(x / y);
        }

    }

}
