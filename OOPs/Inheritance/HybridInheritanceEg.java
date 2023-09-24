package Inheritance;

//More than one type of inheritance is called Hybrid Inheritance
public class HybridInheritanceEg {
    public static void main(String[] args) {
        Fish whaleFish = new Fish();
        whaleFish.swim();
        whaleFish.breathe();
        Dog doggy = new Dog();
        doggy.walks();
        doggy.breed();
        doggy.color();

        // Output : Swim breathes Walks PitBull White

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

class Dog extends Mammals {
    void breed() {
        System.out.println("PitBull");
    }

}