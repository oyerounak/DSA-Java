package Inheritance;

//Multi Level Inheritance means Deriving a class from other derived class
//Here we are deriving Dogs from Mammal which is derived class of Animals(base Class)
public class MultiInheritanceEg {
    public static void main(String[] args) {
        Dogs sinu = new Dogs();
        sinu.eat();
        sinu.legs = 4;
        sinu.breed = "Street Dog";
        System.out.println(sinu.legs + " Legs " + sinu.breed);

    }
}
// Animal is in the same package Inheritance

class Mammal extends Animals {
    int legs;
}

class Dogs extends Mammal {
    String breed;

}