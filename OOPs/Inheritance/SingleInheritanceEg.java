package Inheritance;

//Single level Inheritance means Class B inherits all properties of Class A.
public class SingleInheritanceEg {
    public static void main(String[] args) {
        Fishes shark = new Fishes();
        shark.eat();
        shark.swim();

    }

}

// Parent class or Base Class
class Animals {
    String color;
    String eat;
    String breathe;

    void eat() {
        System.out.println("Eats Meat");
    }

    void breathe() {
        System.out.println("breathes");
    }

    void color() {
        System.out.println("White");
    }
}

// Child Class or Derived Class or Sub Class
class Fishes extends Animals {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }

}
