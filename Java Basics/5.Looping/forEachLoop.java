import java.util.Arrays;

public class forEachLoop {
    public static void main(String[] args) {

        // Example : 1
        int marks[] = { 12, 99, 991, 187, 34, 76, 87 }; //arrayy of type int

        int maximum = marks[0];
        for (int num : marks) {
            if (num > maximum) {
                maximum = num;
            }
        }
        System.out.println(maximum);

        // Example : 2
        String name[] = { "Raunak", "Rajat", "Saksham", "Adarsh", "Swapnil", "Subham" }; //Array of type string

        for (String x : name) {
            System.out.println(x);
        }

    }

}
