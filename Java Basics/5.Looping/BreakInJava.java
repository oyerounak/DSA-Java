public class BreakInJava {
    public static void main(String[] args) {

        // Example : 1 break in for loop
        for (int i = 0; i < 10; i++) {
            if (i == 4)
                break;
            System.out.print(i + " ");
        }
        System.out.println("  ");

        // Example :2 Break in nested for loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2)
                    break;
                System.out.print(j + " "); // Output : 0 1 0 1 0 1
            }
        }
        System.out.println(" ");

        // Example : 3 Labeled Break
        boolean t =true;
        first:{
            second:{
                third:{
                    System.out.println("Before the break statement");
                    if(t){
                        break second;
                    }
                    System.out.println("This won't Execute");
                }
                System.out.println("this won't execute");
            }
            System.out.println("This is after second block");
        }

        //Example : 4 Labeled break for Nested loop 1
        fourth: for (int k = 0; k < 3; k++) {
            // Second label
            fifth: for (int j = 0; j < 3; j++) {
                if (k == 1 && j == 1) {

                    // Using break statement with label
                    break fourth;
                }
                System.out.println(k + " " + j);
            }
        }

        // Example :5 Labeled break for nested loop 2
        fi1: for (int i = 1; i < 6; ++i) {

            // inner loop
            for (int j = 1; j < 5; ++j) {
                if (i == 3 || j == 2)

                    // break the current iteration of outer loop
                    break fi1;
                System.out.println("i = " + i + "; j = " + j);
            }
        }

    }

}
