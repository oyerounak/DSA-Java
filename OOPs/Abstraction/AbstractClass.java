package Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken ch = new Chicken();
        // ch.eat();
        // ch.walk();

        // Order of constructor calls will be Animal->Horse->Mustang
        Mustang myHorse = new Mustang();

    }
}

// abstract class
abstract class Animal {

    // non-abstract method
    void eat() {
        System.out.println("Animal Eats food");
    }

    // abstract method
    abstract void walk();

    // Constructor(It will work fine without constructor)
    Animal() {
        System.out.println("Animal constructor called"); // To call any method first we write it in constructors
    }

}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse Walks on 4 Legs");
    }

    Horse() {
        System.out.println("Horse constructor called");

    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called");
    }

}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken Walks on 2 Legs");
    }

    Chicken() {
        System.out.println("Chicken Constructor called");
    }
}
