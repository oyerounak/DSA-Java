package Polymorphism;

/*
Runtime polymorphism is achieved by Method Overriding 
Method Overriding -> Function overriding means when the child class contains the method which is already present in the parent class. 
Hence, the child class overrides the method of the parent class.
Note: Static methods are bonded at compile time using static binding. Therefore, we cannot override static methods in Java.
Final methods can not be overridden.  
Private methods can not be overridden.
A constructor can not be overridden.
*/
public class RunTimeRide {
    public static void main(String[] args) {
        Deers d = new Deers();
        d.eat();
        // output : Eats grass

        Circle cl = new Circle();
        cl.area(3);

    }
}

// Parent class
class Animal {
    void eat() {
        System.out.println("Eats Anything");
    }

}

class Deers extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
