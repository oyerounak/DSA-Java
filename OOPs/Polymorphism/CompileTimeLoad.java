package Polymorphism;

/*Compile time polymorphism is achieved by Method Overloading 
Method Overloading -> Multiple functions with same name but different parameters performing different functionality.
* Function can be overloaded in two ways:- 1.Number of arguments(parameter) passed to the func.
                                           2.Type of arguments(parameter) passed to the func.
Note: We can overload Static method
*/
public class CompileTimeLoad {
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        System.out.println(calci.sum(1 + 3 + 9, 8, 3));
        System.out.println(calci.sum(7.87f, 8.2f));
        System.out.println(calci.sum(2, 3));
    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float x, float y) {
        return x + y;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}