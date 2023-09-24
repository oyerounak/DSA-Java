package Inheritance;

// Hierarchial inheritance means deriving more than one class from base class.
public class HierarchialInheritanceEg {
    public static void main(String[] args) {
        Fish whaleFish = new Fish();
        whaleFish.swim();
        whaleFish.breathe();
        whaleFish.color = "Grey";
        System.out.println(whaleFish.color);
        Mammals doggy = new Mammals();
        doggy.walks();
        doggy.color(); // Initial color

        // Output : Swim breathes grey Walks White

    }
}
// No need to create Animals Class as it already there in same package
// Inheritance

class Mammals extends Animals {
    void walks() {
        System.out.println("Walks");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("Swim");
    }
}

class Birds extends Animals {
    void fly() {
        System.out.println("Fly");
    }
}