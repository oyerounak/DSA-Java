package Inheritance;
/*
"Multiple inheritance" in java can be implemented using "interface" keyword.

*/

public class MultipleInheritance {
    public static void main(String[] args) {
        Human me = new Human();
        me.eatsMeat();
        me.eatsGreen();
        me.walk();
    }

}

interface Herbivore {
    void eatsGreen();
    void walk();

}

interface Carnivore {
    void eatsMeat();
    void walk();

}

class Human implements Herbivore, Carnivore {
    public void walk(){
        System.out.println("Human like to walk");
    }

    public void eatsGreen() {
        System.out.println("Human Eats Green food");
    }

    public void eatsMeat() {
        System.out.println("Human Eats Meat food");
    }

    Human() { //First constructor will be called
        System.out.println("Human likes to eat both.");
    }

}